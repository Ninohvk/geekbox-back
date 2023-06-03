package com.shop.geekbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.geekbox.dto.LoginDTO;
import com.shop.geekbox.repository.PersonaRepository;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    PersonaRepository personaRepository;

    @PostMapping(value = "")
    public boolean login(@RequestBody LoginDTO login) {
        return personaRepository.findByCemailAndCpass(login.getMail(), login.getPassword()) != null? true: false;
    }
}
