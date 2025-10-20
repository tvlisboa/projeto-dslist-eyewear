package org.serratec.dev.dslistclothes.services;

import org.serratec.dev.dslistclothes.dto.OculosDTO;
import org.serratec.dev.dslistclothes.dto.OculosMinDTO;
import org.serratec.dev.dslistclothes.entities.Oculos;
import org.serratec.dev.dslistclothes.repositories.OculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class OculosService {

    @Autowired
    private OculosRepository oculosRepository;

    @Transactional(readOnly = true)
    public List<OculosMinDTO> findAll(){
        List<Oculos> result = oculosRepository.findAll();
        List<OculosMinDTO> dto = result.stream().map(x -> new OculosMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public OculosDTO findById(Long id){
        Oculos result = oculosRepository.findById(id).get();
        OculosDTO dto = new OculosDTO(result);
        return dto;
    }
}
