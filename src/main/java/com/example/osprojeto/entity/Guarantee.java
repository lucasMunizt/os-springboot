package com.example.osprojeto.entity;


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
@Table(name = "guarantees")
public class Guarantee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double value;
    private String extensiveValue;
    private String product;

    @ManyToOne
    @JoinColumn(name = "orderofservice_client")
    private OrderofService orderofService;
}
