package com.anemogai.ace.underwear.community.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
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

    //@Size(min = 2, message = "{valid.name.size}")
    //@NotBlank(message = "{valid.blank}")
    @NotBlank(message = "Not blank")
    @Size(min = 2, message = "Bigger than 2")
    private String name;

    //@NotBlank(message = "{valid.blank}")
    @NotBlank(message = "Not blank")
    private String gender;

    //@Size(min = 6, max = 15, message = "{valid.password.size}")
    //@NotBlank(message = "{valid.blank}")
    @NotBlank(message = "Not blank")
    @Size(min = 6, max = 15, message = "Between 6 and 15")
    private String password;

    //@NotBlank(message = "{valid.blank}")
    @NotBlank(message = "Not blank")
    @Column(name = "phone_number")
    private String phoneNumber;

    //@NotBlank(message = "{valid.blank}")
    @NotBlank(message = "Not blank")
    @Email
    private String email;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Address> addresses = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Cart> carts = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Order> orders = new ArrayList<>();

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;


    public User(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public User(String name, String gender, String password, String phoneNumber, String email) {
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public User(String name, String gender, String password, String phoneNumber, String email, LocalDate createdAt, LocalDate updatedAt) {
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
