package cloning_project.demo.Menu;

import cloning_project.demo.Store.Store;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="store_id")
    private Store store;

    private String name;
    private Integer price;
    private String description;

    // 카테고리를 어떻게 하지..
    // 사진도 있으면 좋긴 한데... 아직...
}
