package com.anemogai.ace.underwear.community.entities.order.adress;

import com.anemogai.ace.underwear.community.entities.cart.Cart;
import com.anemogai.ace.underwear.community.entities.user.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "address")
public class Address {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @NotBlank
    private String country;

    @NotBlank
    private String city;

    @NotBlank
    private String street;

    @NotBlank
    private Integer building;

    private Integer apartment;

}
