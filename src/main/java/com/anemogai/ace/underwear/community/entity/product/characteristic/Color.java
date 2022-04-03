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
@Table(name = "color")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String color;

    @ManyToMany(mappedBy = "colors")
    private List<Product> productList = new ArrayList<>();


    public Color(String color) {
        this.color = color;
    }

    public Color(String color, List<Product> productList) {
        this.color = color;
        this.productList = productList;
    }
}
