package com.anemogai.ace.underwear.community.entities.product.characteristics;

import com.anemogai.ace.underwear.community.entities.product.Product;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "cats")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cat_title")
    private String catTitle;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Product> productList = new ArrayList<>();

    public Category(String catTitle, List<Product> productList) {
        this.catTitle = catTitle;
        this.productList = productList;
    }
}
