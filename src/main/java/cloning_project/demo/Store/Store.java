package cloning_project.demo.Store;

import cloning_project.demo.Other.Address;
import cloning_project.demo.Menu.Menu;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
public class Store {
    @Id @GeneratedValue
    @Column(name = "store_id")
    private Long Id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany
    private List<Menu> menuList;
}
