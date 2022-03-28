package com.anemogai.ace.underwear.community.entities.product;

import com.anemogai.ace.underwear.community.entities.product.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Float price;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "cat_id")
    private Category category;

    public Product(String name, String description, Float price, Category category, LocalDate createdAt, LocalDate updatedAt) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
