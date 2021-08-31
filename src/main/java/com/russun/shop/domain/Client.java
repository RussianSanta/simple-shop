package com.russun.shop.domain;


import com.russun.shop.repos.BasketRepos;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String login;
    private String psswrd;
    private String mail;
    private int accesType;

    @OneToOne(cascade = CascadeType.ALL)
    private Basket basket;

    public Client() {
    }

    public Client(String login, String psswrd, String mail) {
        this.login = login;
        this.psswrd = psswrd;
        this.mail = mail;

        this.accesType = 0;

        this.basket = new Basket(this);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPsswrd() {
        return psswrd;
    }

    public void setPsswrd(String psswrd) {
        this.psswrd = psswrd;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAccesType() {
        return accesType;
    }

    public void setAccesType(int accesType) {
        this.accesType = accesType;
    }

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
