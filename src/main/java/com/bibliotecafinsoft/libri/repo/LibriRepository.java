package com.bibliotecafinsoft.libri.repo;

import com.bibliotecafinsoft.libri.entity.Libri;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibriRepository extends JpaRepository<Libri,Integer> {
}