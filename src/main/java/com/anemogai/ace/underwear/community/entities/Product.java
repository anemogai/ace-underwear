package com.anemogai.ace.underwear.community.entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Integer quantity;

    private Integer price;

    @ManyToOne
    @JoinColumn(name = "cat_id")
    private Category category;

}
