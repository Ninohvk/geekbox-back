package com.shop.geekbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.geekbox.dto.LoginDTO;
import com.shop.geekbox.model.Persona;
import com.shop.geekbox.repository.PersonaRepository;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    PersonaRepository personaRepository;

    @PostMapping(value = "")
    public Persona login(@RequestBody LoginDTO login) {
        return personaRepository.findByCemailAndCpass(login.getMail(), login.getPassword());
    }
}
