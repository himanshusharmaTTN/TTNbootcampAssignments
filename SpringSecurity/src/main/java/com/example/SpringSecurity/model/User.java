package com.example.SpringSecurity.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
 public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<Role> roles;
}
