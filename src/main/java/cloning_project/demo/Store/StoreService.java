package cloning_project.demo.Store;

import cloning_project.demo.Menu.Menu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StoreService {
    private final StoreRepository storeRepository;

    public List<Store> searchStoreBasedCategory(String categoryName) {
        // 아직 Category 구현 못했으니 패쓰
        return null;
    }

    @Transactional
    public String register(Store store) {
        storeRepository.save(store);
        return "OK";
    }

    @Transactional
    public String addMenu(Long storeId, Menu menu) {
        Store store = storeRepository.findOne(storeId);
        store.getMenuList().add(menu);
        return "OK";
    }

//    public String removeMenu(Long menuId) {
//    }

//    public String removeStore(Long storeId) {
//    }

    public Store findStore(Long storeId) {
        return storeRepository.findOne(storeId);
    }
}
