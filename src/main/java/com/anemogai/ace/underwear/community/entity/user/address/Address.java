package com.anemogai.ace.underwear.community.entity.user.address;

import com.anemogai.ace.underwear.community.entity.user.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;

    private String city;

    private String street;

    private Integer building;

    private Integer apartment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
