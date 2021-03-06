package com.anemogai.ace.underwear.community.entity;

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
@Table(name = "size")
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String size;

    @ManyToMany(mappedBy = "sizes")
    private List<Product> productList = new ArrayList<>();


    public Size(String size) {
        this.size = size;
    }

    public Size(String size, List<Product> productList) {
        this.size = size;
        this.productList = productList;
    }
}
