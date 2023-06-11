package com.shop.geekbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @PostMapping(value = "")
    public ProductoOferta save(@RequestBody ProductoOferta productoOferta) {
        return productoOfertaRepository.save(productoOferta);
    }

    @GetMapping(value = "")
    public Iterable<ProductoOferta> get() {
        return productoOfertaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public ProductoOferta getById(@PathVariable("id") Integer id) {
        return productoOfertaRepository.findById(id).get();
    }

    @GetMapping(value = "last-id")
    public Integer getLastId() {
        return productoOfertaRepository.findFirstByOrderByIidProdOferDesc().getIidProdOfer();
    }
}
