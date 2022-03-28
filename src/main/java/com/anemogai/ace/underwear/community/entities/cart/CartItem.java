package com.anemogai.ace.underwear.community.entities.cart;

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
@Table(name = "cart_item")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "cart_id")
    private Long cartId;

    private Float price;

    private Integer quantity;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public CartItem(Float price, Integer quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public CartItem(Float price, Integer quantity, LocalDate createdAt, LocalDate updatedAt) {
        this.price = price;
        this.quantity = quantity;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
