package com.bibliotecafinsoft.clienti.service;

import com.bibliotecafinsoft.clienti.DTO.ClientiDTO;
import com.bibliotecafinsoft.clienti.entity.Clienti;
import com.bibliotecafinsoft.clienti.mapper.ClientiMapper;
import com.bibliotecafinsoft.clienti.repo.ClientiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientiService {

    @Autowired
    public ClientiRepository clientiRepository;

    //getAll
    public List<ClientiDTO> getAllClienti() {
        List<ClientiDTO> clientiDto = new ArrayList<>();
        for (Clienti cliente : clientiRepository.findAll()) {
            clientiDto.add(ClientiMapper.INSTANCE.toDTO(cliente));
        }
        return clientiDto;
    }

    //getCognome
    public ClientiDTO getCognome(String cognome) {
        Optional<Clienti> opt = clientiRepository.findByCognome(cognome);
        return opt.map(ClientiMapper.INSTANCE::toDTO).orElse(null);
    }

    //create
    public ClientiDTO create(ClientiDTO clienteDTO) {
        Clienti cliente = ClientiMapper.INSTANCE.toEntity(clienteDTO);
        cliente = clientiRepository.save(cliente);
        return ClientiMapper.INSTANCE.toDTO(cliente);
    }

    //update
    public ClientiDTO update(ClientiDTO clienteDTO) {
        Optional<Clienti> optionalcliente = clientiRepository.findById(clienteDTO.getId_cliente());
        if (optionalcliente.isEmpty()) {
            throw new RuntimeException("Cliente non trovato con id " + clienteDTO.getId_cliente());
        }
        Clienti update = ClientiMapper.INSTANCE.toEntity(clienteDTO);
        update = clientiRepository.save(update);
        return ClientiMapper.INSTANCE.toDTO(update);
    }

    //deleteById
    public void deleteById(int id_cliente) {
        Optional<Clienti> cliente = clientiRepository.findById(id_cliente);
        if (cliente.isPresent()) {
            clientiRepository.deleteById(id_cliente);
        } else {
            throw new RuntimeException("Cliente non trovato con id " + id_cliente);
        }
    }

}