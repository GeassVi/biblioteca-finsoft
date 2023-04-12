package com.bibliotecafinsoft.libri.controller;

import com.bibliotecafinsoft.libri.DTO.LibriDTO;
import com.bibliotecafinsoft.libri.service.LibriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/libri")
@CrossOrigin(origins = "*")
public class LibriController {

    @Autowired
    public LibriService libriService;

    @GetMapping("/getAllLibri")
    public List<LibriDTO> getAllLibri() {
        return libriService.getAllLibri();
    }

    @GetMapping("/getIsbn/{isbn}")
    public LibriDTO getIsbn(@PathVariable String isbn) {
        return libriService.getIsbn(isbn);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public LibriDTO create(@RequestBody LibriDTO libroDTO) {
        return libriService.create(libroDTO);
    }

    @PutMapping("/update/{id_libro}")
    public ResponseEntity<LibriDTO> update(@RequestBody LibriDTO libroDTO) {
        LibriDTO updatedLibro = libriService.update(libroDTO);
        return ResponseEntity.ok(updatedLibro);
    }

    @DeleteMapping("/libri/{id_libro}")
    public ResponseEntity<Void> deleteById(@PathVariable int id_libro) {
        libriService.deleteById(id_libro);
        return ResponseEntity.noContent().build();
    }

}