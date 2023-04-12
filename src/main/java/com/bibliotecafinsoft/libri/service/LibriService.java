package com.bibliotecafinsoft.libri.service;

import com.bibliotecafinsoft.libri.DTO.LibriDTO;
import com.bibliotecafinsoft.libri.entity.Libri;
import com.bibliotecafinsoft.libri.mapper.LibriMapper;
import com.bibliotecafinsoft.libri.repo.LibriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibriService {

    @Autowired
    public LibriRepository libriRepository;

    //getAll
    public List<LibriDTO> getAllLibri() {
        List<LibriDTO> libriDto = new ArrayList<>();
        for (Libri libro : libriRepository.findAll()) {
            libriDto.add(LibriMapper.INSTANCE.toDTO(libro));
        }
        return libriDto;
    }

    //getIsbn
    public LibriDTO getIsbn(String isbn) {
        Optional<Libri> opt = libriRepository.findByIsbn(isbn);
        return opt.map(LibriMapper.INSTANCE::toDTO).orElse(null);
    }

//    if (opt.isPresent()) {
//        return LibriMapper.INSTANCE.toDTO(opt.get());
//    }
//
//        return null;
//}


    //create
    public LibriDTO create(LibriDTO libroDTO) {
        Libri libro = LibriMapper.INSTANCE.toEntity(libroDTO);
        libro = libriRepository.save(libro);
        return LibriMapper.INSTANCE.toDTO(libro);
    }

    //update
    public LibriDTO update(LibriDTO libroDTO) {
        Optional<Libri> optionalLibro = libriRepository.findById(libroDTO.getId_libro());
        if (optionalLibro.isEmpty()) {
            throw new RuntimeException("Libro non trovato con id " + libroDTO.getId_libro());
        }
        Libri update = LibriMapper.INSTANCE.toEntity(libroDTO);
        update = libriRepository.save(update);
        return LibriMapper.INSTANCE.toDTO(update);
    }

    //deleteById
    public void deleteById(int id_libro) {
        Optional<Libri> libro = libriRepository.findById(id_libro);
        if (libro.isPresent()) {
            libriRepository.deleteById(id_libro);
        } else {
            throw new RuntimeException("Libro non trovato con id " + id_libro);
        }
    }

}