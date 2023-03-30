package com.bibliotecafinsoft.libri.controller;

import com.bibliotecafinsoft.libri.DTO.LibriDTO;
import com.bibliotecafinsoft.libri.service.LibriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libri")
@CrossOrigin(origins = "*")
public class LibriController {

    @Autowired
    public LibroService libroService;

    @GetMapping("/getAll")
    public String getAll() {

        LibriDTO libroDTO = new LibriDTO();
        libroDTO.getIsbn();
        return "questo è il getAll";
    }

    @GetMapping("/getIsbn")
    public String getIsbn() {
        return "questo è il getIsbn";
    }

    @PostMapping("/create")
    public String create() {
        return "questo è il create";
    }

    @PutMapping("/update")
    public String update() {
        return "questo è l'update";
    }

    @DeleteMapping("/deleteId")
    public String deleteId() {
        return "questo è il delete";
    }

}