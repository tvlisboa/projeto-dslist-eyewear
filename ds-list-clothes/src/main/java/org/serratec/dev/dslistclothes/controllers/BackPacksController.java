package org.serratec.dev.dslistclothes.controllers;

import org.serratec.dev.dslistclothes.dto.BackPacksMinDTO;
import org.serratec.dev.dslistclothes.entities.BackPacks;
import org.serratec.dev.dslistclothes.services.BackPackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/backpacks")
public class BackPacksController {

    @Autowired
    private BackPackService backPackService;

    @GetMapping
    public List<BackPacksMinDTO> findAll() {
        List<BackPacksMinDTO> result = backPackService.findAll();
        return result;
    }
}
