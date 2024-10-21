package com.example.veterinaria.controllers;

import com.example.veterinaria.entities.Mascota;
import com.example.veterinaria.repositories.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    private MascotaRepository mascotaRepository;

    @GetMapping
    public List<Mascota> getAll() {
        return mascotaRepository.findAll();
    }

    @PostMapping
    public Mascota create(@RequestBody Mascota mascota) {
        return mascotaRepository.save(mascota);
    }
}