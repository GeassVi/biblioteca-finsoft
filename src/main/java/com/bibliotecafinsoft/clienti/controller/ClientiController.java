package com.bibliotecafinsoft.clienti.controller;

import com.bibliotecafinsoft.clienti.DTO.ClientiDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clienti")
@CrossOrigin(origins = "*")
public class ClientiController {
    @GetMapping("/getAll")
    public String getAll() {

        ClientiDTO clienteDTO = new ClientiDTO();
        clienteDTO.getId_cliente();
        return "questo è il getAll";
    }

    @GetMapping("/getId_cliente")
    public String getIsbn() {
        return "questo è il getId_cliente";
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