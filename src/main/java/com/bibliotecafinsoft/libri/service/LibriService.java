package com.bibliotecafinsoft.libri.service;

import com.bibliotecafinsoft.libri.repo.LibriRepository;
import com.bibliotecafinsoft.libri.DTO.LibriDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibriService {

    @Autowired
    public LibriRepository libriRepository;

    public List<LibriDto> getAll(String isbn) {
        List<Libro> libri = libriRepository.findAllByIsbn(isbn);
        List<LibriDto> libriDto = new List<>();
        for (Libro libro : libri) {
            libriDto.add(convertToDto(libro));
        }
        return libriDto;
    }

}
