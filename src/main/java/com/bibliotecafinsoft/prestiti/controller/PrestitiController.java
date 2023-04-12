package com.bibliotecafinsoft.prestiti.controller;

import com.bibliotecafinsoft.clienti.DTO.ClientiDTO;
import com.bibliotecafinsoft.prestiti.DTO.PrestitiDTO;
import com.bibliotecafinsoft.prestiti.service.PrestitiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestiti")
@CrossOrigin(origins = "*")
public class PrestitiController {

    @Autowired
    public PrestitiService prestitiService;

    @GetMapping("/getAllPrestiti")
    public List<PrestitiDTO> getAllPrestiti() {
        return prestitiService.getAllPrestiti();
    }

}

