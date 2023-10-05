package cloning_project.demo.Menu;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MenuController {
    private final MenuService menuService;

    @DeleteMapping("menu/{menuId}")
    public String removeMenu(@PathVariable("menuId") Long menuId) {
        menuService.removeMenu(menuId);
        return "OK";
    }
}
