package org.serratec.dev.dslistclothes.services;

import org.serratec.dev.dslistclothes.dto.OculosDTO;
import org.serratec.dev.dslistclothes.dto.OculosMinDTO;
import org.serratec.dev.dslistclothes.entities.Oculos;
import org.serratec.dev.dslistclothes.projections.OculosMinProjection;
import org.serratec.dev.dslistclothes.repositories.OculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class OculosService {

    @Autowired
    private OculosRepository oculosRepository;

    @Transactional(readOnly = true)
    public List<OculosMinDTO> findAll(){
        List<Oculos> result = oculosRepository.findAll();
        return result.stream().map(OculosMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public OculosDTO findById(@PathVariable Long id){
        Oculos result = oculosRepository.findById(id).get();
        return new OculosDTO(result);
    }

    @Transactional(readOnly = true)
    public List<OculosMinDTO> findBylist(Long listId){
        List<OculosMinProjection> oculos = oculosRepository.searchByList(listId);
        return oculos.stream().map(OculosMinDTO::new).toList();
    }
}
