package org.serratec.dev.dslistclothes.controllers;
import org.serratec.dev.dslistclothes.dto.OculosMinDTO;
import org.serratec.dev.dslistclothes.services.OculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/oculos")
public class OculosController {

    @Autowired
    private OculosService oculosService;

    @GetMapping
    public List<OculosMinDTO> findAll(){
        List<OculosMinDTO> result = oculosService.findAll();
        return result;
    }

    @GetMapping("/{id}")
    public OculosMinDTO findById(Long id){
        OculosMinDTO result = oculosService.findById((id));
        return result;
    }
}
