package org.serratec.dev.dslistclothes.services;

import org.serratec.dev.dslistclothes.dto.OculosMinDTO;
import org.serratec.dev.dslistclothes.dto.ShoesMinDTO;
import org.serratec.dev.dslistclothes.entities.Shoes;
import org.serratec.dev.dslistclothes.repositories.ShoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoesService {

    @Autowired
    public ShoesRepository shoesRepository;

    public List<ShoesMinDTO> findAll(){
        List<Shoes> result = shoesRepository.findAll();
        List<ShoesMinDTO> dto = result.stream().map(x -> new ShoesMinDTO(x)).toList();
        return dto;
    }
}
