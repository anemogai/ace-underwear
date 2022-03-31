package com.anemogai.ace.underwear.community.entities.user;

import com.anemogai.ace.underwear.community.entities.cart.Cart;
import com.anemogai.ace.underwear.community.entities.cart.CartItem;
import com.anemogai.ace.underwear.community.entities.order.Order;
import com.anemogai.ace.underwear.community.entities.order.adress.Address;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String gender;

    @NotBlank
    private String password;

    @NotBlank
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotBlank
    @Email
    private String email;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Address> addresses = new ArrayList<>();

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Cart cart;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Order order;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, String phoneNumber) {
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User(String name, String phoneNumber, String email, LocalDate createdAt, LocalDate updatedAt) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
