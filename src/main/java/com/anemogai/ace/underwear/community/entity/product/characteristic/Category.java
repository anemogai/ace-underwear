package com.anemogai.ace.underwear.community.entity.product.characteristic;

import com.anemogai.ace.underwear.community.entity.product.Product;
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
@Table(name = "cat")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Product> productList = new ArrayList<>();


    public Category(String title) {
        this.title = title;
    }

    public Category(String title, List<Product> productList) {
        this.title = title;
        this.productList = productList;
    }
}
