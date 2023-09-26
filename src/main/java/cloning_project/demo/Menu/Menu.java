package cloning_project.demo.Menu;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Menu {
    @Id @GeneratedValue
    @Column(name="menu_id")
    private Long id;

    private String name;
    private Integer price;
    private String description;

    // 사진도 있으면 좋긴 한데... 아직...
}
