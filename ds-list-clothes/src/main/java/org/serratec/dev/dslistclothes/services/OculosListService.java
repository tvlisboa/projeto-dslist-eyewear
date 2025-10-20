package org.serratec.dev.dslistclothes.services;

import org.serratec.dev.dslistclothes.dto.OculosDTO;
import org.serratec.dev.dslistclothes.dto.OculosListDTO;
import org.serratec.dev.dslistclothes.dto.OculosMinDTO;
import org.serratec.dev.dslistclothes.entities.Oculos;
import org.serratec.dev.dslistclothes.entities.OculosList;
import org.serratec.dev.dslistclothes.repositories.OculosListRepository;
import org.serratec.dev.dslistclothes.repositories.OculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OculosListService {

    @Autowired
    private OculosListRepository oculosListRepository;

    @Transactional(readOnly = true)
    public List<OculosListDTO> findAll(){
        List<OculosList> result = oculosListRepository.findAll();
        return result.stream().map( x -> new OculosListDTO(x)).toList();
    }
}
