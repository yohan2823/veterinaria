package com.example.veterinaria.controllers;

import com.example.veterinaria.entities.Propietario;
import com.example.veterinaria.repositories.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/propietarios")
public class PropietarioController {

    @Autowired
    private PropietarioRepository propietarioRepository;

    @GetMapping
    public List<Propietario> getAll() {
        return propietarioRepository.findAll();
    }

    @PostMapping
    public Propietario create(@RequestBody Propietario propietario) {
        return propietarioRepository.save(propietario);
    }
}