package org.serratec.dev.dslistclothes.controllers;

import org.serratec.dev.dslistclothes.dto.ShoesMinDTO;
import org.serratec.dev.dslistclothes.services.ShoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/shoes")
public class ShoesController {

    @Autowired
    private ShoesService shoesService;

    @GetMapping
    public List<ShoesMinDTO> findAll() {
        List<ShoesMinDTO> result = shoesService.findAll();
        return result;
    }
}
