package com.russun.shop.controllers;

import com.russun.shop.domain.Client;
import com.russun.shop.repos.ClientRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("registration")
public class RegistrationController {
    @Autowired
    private ClientRepos clientRepos;

    @GetMapping
    public Iterable<Client> getUsers(){
        return clientRepos.findAll();
    }

    @PostMapping
    public String registration(@RequestParam String login, @RequestParam String psswrd, @RequestParam String mail){
        Client newClient = new Client(login, psswrd, mail);

        clientRepos.save(newClient);

        return "Все гуд, братан";
    }
}
