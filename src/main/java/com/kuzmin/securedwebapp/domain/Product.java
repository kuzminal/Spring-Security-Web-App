package com.kuzmin.securedwebapp.domain;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;
    @Enumerated(EnumType.STRING)
    private Currency currency;
}
