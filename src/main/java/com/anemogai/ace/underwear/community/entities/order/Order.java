package com.anemogai.ace.underwear.community.entities.order;

import com.anemogai.ace.underwear.community.entities.cart.CartItem;
import com.anemogai.ace.underwear.community.entities.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "user_id")
    private Long userId;

    @NotBlank
    @Column(name = "phone_number")
    private String phoneNumber;

    private String country;

    private String city;

    private String house;

    private String flat;

    private Float total;

    private Integer status;

    private String comment;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private List<OrderItem> items = new ArrayList<>();

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;


}
