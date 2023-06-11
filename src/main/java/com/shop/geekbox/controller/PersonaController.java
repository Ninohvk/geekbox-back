package com.shop.geekbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.geekbox.model.Persona;
import com.shop.geekbox.repository.PersonaRepository;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaRepository personaRepository;

    @PostMapping(value = "")
    public Persona save(@RequestBody Persona persona) {
        return personaRepository.save(persona);
    }

    @GetMapping(value = "last-id")
    public Integer getLastId() {
        return personaRepository.findFirstByOrderByIidPerDesc().getIidPer();
    }
}
