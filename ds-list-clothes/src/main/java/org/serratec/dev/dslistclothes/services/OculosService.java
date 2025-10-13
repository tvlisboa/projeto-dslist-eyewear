package org.serratec.dev.dslistclothes.services;

import org.serratec.dev.dslistclothes.dto.OculosMinDTO;
import org.serratec.dev.dslistclothes.entities.Oculos;
import org.serratec.dev.dslistclothes.repositories.OculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OculosService {

    @Autowired
    private OculosRepository oculosRepository;

    public List<OculosMinDTO> findAll(){
        List<Oculos> result = oculosRepository.findAll();
        List<OculosMinDTO> dto = result.stream().map(x -> new OculosMinDTO(x)).toList();
        return dto;
    }
}
