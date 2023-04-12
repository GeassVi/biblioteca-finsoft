package com.bibliotecafinsoft.clienti.repo;

import com.bibliotecafinsoft.clienti.entity.Clienti;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ClientiRepository extends JpaRepository<Clienti,Integer> {

    Optional<Clienti> findByCognome(String cognome);
    
}