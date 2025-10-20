package org.serratec.dev.dslistclothes.services;

import org.serratec.dev.dslistclothes.dto.BackPacksMinDTO;
import org.serratec.dev.dslistclothes.entities.BackPacks;
import org.serratec.dev.dslistclothes.repositories.BackPacksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BackPackService {

    @Autowired
    private BackPacksRepository backPacksRepository;

    public List<BackPacksMinDTO> findAll() {
        List<BackPacks> result = backPacksRepository.findAll();
        List<BackPacksMinDTO> dto = result.stream().map(x -> new BackPacksMinDTO(x)).toList();
        return dto;
    }
}
