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
@Table(name = "orderofservices")
public class OrderofService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String device;
    private String claims;
    private String observation;
    private Double value;

    @ManyToOne
    @JoinColumn(name = "orderofservice_client")
    private Client client;

}