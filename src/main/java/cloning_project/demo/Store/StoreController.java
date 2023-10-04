package cloning_project.demo.Store;

import cloning_project.demo.Menu.Menu;
import cloning_project.demo.Other.Address;
import cloning_project.demo.Other.MenuForm;
import cloning_project.demo.Other.StoreForm;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.awt.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;

    @GetMapping("store/{categoryId}")
    public List<Store> searchStoreBasedCategory(@PathVariable("category") String categoryName) {
        return storeService.searchStoreBasedCategory(categoryName);
    }

    @GetMapping("store/{storeId}")
    public Store findStore(@PathVariable("storeId") Long storeId) {
        return storeService.findStore(storeId);
    }

    @PostMapping("store")
    public String registerStore(StoreForm storeForm) {
        Store store = new Store();
        store.setName(storeForm.getName());

        Address address = new Address(storeForm.getCity(), storeForm.getStreet(), storeForm.getZipcode());
        store.setAddress(address);

        /*store.setMenuList();*/

        return storeService.register(store);
    }

    @DeleteMapping("store/{storeId}")
    public String removeStore(@PathVariable("storeId") Long storeId) {
        storeService.removeStore(storeId);
        return "OK";
    }

    @PostMapping("{storeId}/menu")
    public String addMenu(MenuForm menuForm) {
        Menu menu = new Menu();
        Long storeId = menuForm.getStoreId();

        // menu에 post로 받은 menuform 정보 세팅
        menu.setName(menuForm.getName());
        menu.setPrice(menuForm.getPrice());
        menu.setDescription(menuForm.getDescription());

        return storeService.addMenu(storeId, menu);
    }
}
