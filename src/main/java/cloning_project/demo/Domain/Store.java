package cloning_project.demo.Domain;

import javax.persistence.*;

@Entity
public class Store {
    @Id @GeneratedValue
    @Column(name = "store_id")
    private Long Id;

    @Column(name="store_name")
    private String name;

    @Embedded
    private Address address;

    @OneToMany
    private List<Menu> menus;

}
