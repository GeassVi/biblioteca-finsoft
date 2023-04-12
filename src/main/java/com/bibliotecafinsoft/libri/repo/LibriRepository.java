package com.bibliotecafinsoft.libri.repo;

import com.bibliotecafinsoft.libri.entity.Libri;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface LibriRepository extends JpaRepository<Libri,Integer> {

    Optional<Libri> findByIsbn(String isbn);
    
}