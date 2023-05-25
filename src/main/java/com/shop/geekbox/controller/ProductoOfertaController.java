package com.shop.geekbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.geekbox.model.ProductoOferta;
import com.shop.geekbox.repository.ProductoOfertaRepository;

@RestController
@RequestMapping("/producto-oferta")
public class ProductoOfertaController {

    @Autowired
    ProductoOfertaRepository productoOfertaRepository;
    
    @PostMapping(value = "/save")
    public ProductoOferta save(@RequestBody ProductoOferta productoOferta) {
        System.out.println("Se crea un producto!!");
        productoOferta.setIIdProdOfer(1);
        return productoOfertaRepository.save(productoOferta);
    }
}
