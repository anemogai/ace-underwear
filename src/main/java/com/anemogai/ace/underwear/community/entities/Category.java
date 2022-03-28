package com.anemogai.ace.underwear.community.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cats")
@Getter
@Setter
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cat_name")
    private String catName;

    private String desc;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Product> productList = new ArrayList<>();

    public Category(String catName, String desc) {
        this.catName = catName;
        this.desc = desc;
    }
}
