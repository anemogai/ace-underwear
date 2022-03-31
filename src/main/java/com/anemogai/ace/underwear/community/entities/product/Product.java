package com.anemogai.ace.underwear.community.entities.product;

import com.anemogai.ace.underwear.community.entities.cart.CartItem;
import com.anemogai.ace.underwear.community.entities.order.OrderItem;
import com.anemogai.ace.underwear.community.entities.product.characteristics.Category;
import com.anemogai.ace.underwear.community.entities.product.characteristics.Color;
import com.anemogai.ace.underwear.community.entities.product.characteristics.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Float price;

    @ManyToOne
    @JoinColumn(name = "cat_id")
    private Category category;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Color> colors = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Size> sizes = new ArrayList<>();

    @OneToOne(mappedBy = "product")
    private OrderItem orderItem;

    @OneToOne(mappedBy = "product")
    private CartItem cartItem;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;


    public Product(String title, Float price, Category category, List<Color> colors, List<Size> sizes, LocalDate createdAt, LocalDate updatedAt) {
        this.title = title;
        this.price = price;
        this.category = category;
        this.colors = colors;
        this.sizes = sizes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
