package com.bibliotecafinsoft.libri.mapper;

import com.bibliotecafinsoft.libri.DTO.LibriDTO;
import com.bibliotecafinsoft.libri.entity.Libri;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LibriMapper {

    LibriMapper INSTANCE= Mappers.getMapper(LibriMapper.class);
    LibriDTO toDTO(Libri libri);
    Libri toEntity(LibriDTO dto);
}
