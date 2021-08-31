package com.russun.shop.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    private Client client;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Product> products = new HashSet<Product>();

    public Basket() {
    }

    public Basket(Client client) {
        this.client = client;
    }
}
