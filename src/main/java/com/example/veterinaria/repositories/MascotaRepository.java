package com.example.veterinaria.repositories;


import com.example.veterinaria.entities.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends
        JpaRepository<Mascota, Integer> {
}