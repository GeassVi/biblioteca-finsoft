package com.bibliotecafinsoft.clienti.controller;

import com.bibliotecafinsoft.clienti.DTO.ClientiDTO;
import com.bibliotecafinsoft.clienti.service.ClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clienti")
@CrossOrigin(origins = "*")
public class ClientiController {

    @Autowired
    public ClientiService clientiService;

    @GetMapping("/getAllClienti")
    public List<ClientiDTO> getAllClienti() {
        return clientiService.getAllClienti();
    }

    @GetMapping("/getCognome/{cognome}")
    public ClientiDTO getCognome(@PathVariable String cognome) {
        return clientiService.getCognome(cognome);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ClientiDTO create(@RequestBody ClientiDTO clienteDTO) {
        return clientiService.create(clienteDTO);
    }

    @PutMapping("/update/{id_cliente}")
    public ResponseEntity<ClientiDTO> update(@RequestBody ClientiDTO clienteDTO) {
        ClientiDTO updatedcliente = clientiService.update(clienteDTO);
        return ResponseEntity.ok(updatedcliente);
    }

    @DeleteMapping("/libri/{id_cliente}")
    public ResponseEntity<Void> deleteById(@PathVariable int id_cliente) {
        clientiService.deleteById(id_cliente);
        return ResponseEntity.noContent().build();
    }

}