package cloning_project.demo.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.awt.*;

@RestController
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;

    @GetMapping("store/search/{categoryId}")
    public List<Store> searchStoreBasedCategory(@PathVariable("category") String categoryName) {
        return storeService.searchStoreBasedCategory(categoryName);
    }

    @GetMapping("store/info/{storeId}")
    public Store findStore(@PathVariable("storeId") Long storeId) {
        return storeService.findStore(storeId);
    }

    @PostMapping("store")
    public String registerStore(StoreForm storeForm) {
        Store store = new Store();
        store.setName(storeForm.getName());

        Address address = new Address();
        address.setCity(storeForm.getCity());
        address.setStreet(storeForm.getStreet());
        address.setZipCode(storeForm.getZipCode());

        store.setAddress(address);

        return storeService.register(store);
    }

    @DeleteMapping("store/store/{storeId}")
    public String removeStore(@PathVariable("storeId") Long storeId) {
        return storeService.removeStore(storeId);
    }

    @PostMapping("store/menu")
    public String addMenu(MenuForm menuForm) {
        Menu menu = new Menu();
        Long storeId = menuForm.getStoreId();

        // menu에 post로 받은 menuform 정보 세팅

        return storeService.addMenu(storeId, menu);
    }

    @DeleteMapping("store/menu/{menuId}")
    public String removeMenu(@PathVariable("menuId") Long menuId) {
        return storeService.removeMenu(menuId);
    }
}
