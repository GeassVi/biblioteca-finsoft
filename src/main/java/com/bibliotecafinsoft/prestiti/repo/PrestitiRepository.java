package com.bibliotecafinsoft.prestiti.repo;

import com.bibliotecafinsoft.prestiti.entity.Prestiti;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PrestitiRepository extends JpaRepository<Prestiti,Integer> {
}