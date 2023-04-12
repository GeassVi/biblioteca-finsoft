package com.bibliotecafinsoft.prestiti.mapper;

import com.bibliotecafinsoft.prestiti.DTO.PrestitiDTO;
import com.bibliotecafinsoft.prestiti.entity.Prestiti;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PrestitiMapper {

    PrestitiMapper INSTANCE= Mappers.getMapper(PrestitiMapper.class);
    PrestitiDTO toDTO(Prestiti prestiti);
    Prestiti toEntity(PrestitiDTO dto);
}
