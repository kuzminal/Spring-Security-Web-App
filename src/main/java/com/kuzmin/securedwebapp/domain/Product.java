package com.kuzmin.securedwebapp.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String name;
    public double price;
    @Enumerated(EnumType.STRING)
    public Currency currency;
}
