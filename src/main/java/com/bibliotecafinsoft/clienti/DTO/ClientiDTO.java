package com.bibliotecafinsoft.clienti.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.io.Serializable;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ClientiDTO implements Serializable {
    private int id_cliente;
    private String nome;
    private String cognome;
    private String email;
    private String telefono;
    private String data_nascita;
    private static final long serialVersionUID = 1L;
}
