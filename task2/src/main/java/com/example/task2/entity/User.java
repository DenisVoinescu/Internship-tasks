package com.example.task2.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@Table(name = "users", schema = "public", catalog = "postgres")
public class User {
    public User(String email, String username, String password){
        this.email = email;
        this.username = username;
        this.password = password;
    }
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name="email", nullable = false, length = 70)
    private String email;
    @Basic
    @Column(name = "username", nullable = false, length = 25)
    private String username;
    @Basic
    @Column(name = "password")
    private String password;


}
