package com.bibliotecafinsoft.prestiti.service;

import com.bibliotecafinsoft.prestiti.DTO.PrestitiDTO;
import com.bibliotecafinsoft.prestiti.entity.Prestiti;
import com.bibliotecafinsoft.prestiti.mapper.PrestitiMapper;
import com.bibliotecafinsoft.prestiti.repo.PrestitiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PrestitiService {

    @Autowired
    public PrestitiRepository prestitiRepository;

    //getAll
    public List<PrestitiDTO> getAllPrestiti() {
        List<PrestitiDTO> prestitiDto = new ArrayList<>();
        for (Prestiti prestito : prestitiRepository.findAll()) {
            prestitiDto.add(PrestitiMapper.INSTANCE.toDTO(prestito));
        }
        return prestitiDto;
    }
}