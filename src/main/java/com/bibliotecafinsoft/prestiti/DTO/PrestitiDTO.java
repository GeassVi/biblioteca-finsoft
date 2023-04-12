package com.bibliotecafinsoft.prestiti.DTO;

import com.bibliotecafinsoft.clienti.DTO.ClientiDTO;
import com.bibliotecafinsoft.libri.DTO.LibriDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude
public class PrestitiDTO implements Serializable {
    private int id_prestito;
    private LibriDTO id_libro;
    private ClientiDTO id_cliente;
    private String data_inizio;
    private String data_fine;
    private String data_consegna;
    private static final long serialVersionUID = 1L;
}
