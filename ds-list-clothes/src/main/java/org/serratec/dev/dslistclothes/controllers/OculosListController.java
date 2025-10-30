package org.serratec.dev.dslistclothes.controllers;
import org.serratec.dev.dslistclothes.dto.OculosListDTO;
import org.serratec.dev.dslistclothes.dto.OculosMinDTO;
import org.serratec.dev.dslistclothes.dto.ReplacementDTO;
import org.serratec.dev.dslistclothes.projections.OculosMinProjection;
import org.serratec.dev.dslistclothes.services.OculosListService;
import org.serratec.dev.dslistclothes.services.OculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class OculosListController {

    @Autowired
    private OculosListService oculosListService;

    @Autowired
    private OculosService oculosService;

    @GetMapping
    public List<OculosListDTO> findAll(){
        List<OculosListDTO> result = oculosListService.findAll();
        return result;
    }

    /**
     * Consulta por listas e
     * os itens que sao pertencentes
     */

    @GetMapping(value = "/{listId}/oculos")
    public List<OculosMinDTO> findByList(@RequestParam Long listId){
        List<OculosMinDTO> result = oculosService.findBylist(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/oculos")
    public void move(@PathVariable Long listId, @RequestParam ReplacementDTO body){
        OculosListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
