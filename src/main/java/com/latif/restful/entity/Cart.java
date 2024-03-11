package com.latif.restful.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Cart {

    @Id
    private String id;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name= "username", referencedColumnName = "username")
    private User user;
}
