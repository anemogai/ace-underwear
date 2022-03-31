package com.anemogai.ace.underwear.community.entities.user;

import com.anemogai.ace.underwear.community.entities.cart.Cart;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String role;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Role(String role) {
        this.role = role;
    }
}
