package org.serratec.dev.dslistclothes.controllers;
import org.serratec.dev.dslistclothes.dto.OculosListDTO;
import org.serratec.dev.dslistclothes.services.OculosListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class OculosListController {

    @Autowired
    private OculosListService oculosListService;

    @GetMapping
    public List<OculosListDTO> findAll(){
        List<OculosListDTO> result = oculosListService.findAll();
        return result;
    }
}
