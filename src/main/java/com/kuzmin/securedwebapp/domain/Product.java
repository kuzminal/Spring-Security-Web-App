package com.kuzmin.securedwebapp.domain;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String name;
    public double price;
    @Enumerated(EnumType.STRING)
    public Currency currency;
}
