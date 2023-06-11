package com.shop.geekbox.repository;

import org.springframework.data.repository.CrudRepository;

import com.shop.geekbox.model.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {
    Persona findByCemailAndCpass(String mail, String password);

    Persona findFirstByOrderByIidPerDesc();
}
