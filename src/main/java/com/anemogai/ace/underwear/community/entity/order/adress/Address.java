package com.anemogai.ace.underwear.community.entity.order.adress;

import com.anemogai.ace.underwear.community.entity.user.User;
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

    @NotBlank
    private String country;

    @NotBlank
    private String city;

    @NotBlank
    private String street;

    @NotBlank
    private Integer building;

    private Integer apartment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Address(String country, String city, String street, Integer building, Integer apartment) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartment = apartment;
    }

    public Address(String country, String city, String street, Integer building, Integer apartment, User user) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartment = apartment;
        this.user = user;
    }
}
