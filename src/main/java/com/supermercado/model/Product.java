package com.supermercado.model;



import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Integer id;

    @Setter @Getter
    private String name;
    @Setter @Getter
    private double price;


    public Product(){

    }

}
