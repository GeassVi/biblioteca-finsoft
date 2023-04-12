package com.bibliotecafinsoft.libri.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.io.Serializable;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class LibriDTO implements Serializable {
    private int id_libro;
    private String isbn;
    private String titolo;
    private String autore;
    private String anno;
    private String genere;
    private static final long serialVersionUID = 1L;
}