package com.example.SpringSecurity.model;

import jakarta.persistence.*;
import lombok.Data;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Data
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    String name;

    @Override
    public @Nullable String getAuthority() {
        return "ROLE_"+ name;
    }
}
