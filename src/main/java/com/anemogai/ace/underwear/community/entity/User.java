package com.anemogai.ace.underwear.community.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.*;


/*@FieldsValueMatch.List({
        @FieldsValueMatch(
                field = "password",
                fieldMatch = "confirmPassword",
                message = "Passwords do not match"
        ),
})*/

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "user")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Size(min = 2, message = "{valid.name.size}")
    //@NotBlank(message = "{valid.blank}")
    @NotBlank(message = "Should not be blank")
    @Size(min = 2, message = "Name should be longer than 1 letter")
    private String name;

    //@NotBlank(message = "{valid.blank}")
    @NotBlank(message = "Should not be blank")
    private String gender;

    //@Size(min = 6, max = 15, message = "{valid.password.size}")
    //@NotBlank(message = "{valid.blank}")
    @NotBlank(message = "Should not be blank")
    @Size(min = 6, max = 15, message = "Password size should be between 6 and 15")
    private String password;

   /* @NotBlank(message = "Password confirmation is mandatory")
    @Transient
     private String confirmPassword;*/

    //@NotBlank(message = "{valid.blank}")
    @NotBlank(message = "Should not be blank")
    @Email(message = "Email should be valid")
    @Column(unique = true)
    private String email;

    private boolean enabled;

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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return (Collection<? extends GrantedAuthority>) getRoles();
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public User(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public User(String name, String gender, String password, String email) {
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.email = email;
    }

    public User(String name, String gender, String password, String email, LocalDate createdAt, LocalDate updatedAt) {
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


}
