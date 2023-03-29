package com.bibliotecafinsoft.clienti.mapper;

import com.bibliotecafinsoft.clienti.DTO.ClientiDTO;
import com.bibliotecafinsoft.clienti.entity.Clienti;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientiMapper {

    ClientiMapper INSTANCE= Mappers.getMapper(ClientiMapper.class);
    ClientiDTO toDTO(Clienti libri);
    Clienti toEntity(ClientiDTO dto);
}
