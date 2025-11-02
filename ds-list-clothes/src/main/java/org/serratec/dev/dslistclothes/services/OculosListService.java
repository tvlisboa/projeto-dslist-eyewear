package org.serratec.dev.dslistclothes.services;

import org.serratec.dev.dslistclothes.dto.OculosListDTO;
import org.serratec.dev.dslistclothes.entities.OculosList;
import org.serratec.dev.dslistclothes.projections.OculosMinProjection;
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

    @Autowired
    private OculosRepository oculosRepository;

    @Transactional(readOnly = true)
    public List<OculosListDTO> findAll(){
        List<OculosList> result = oculosListRepository.findAll();
        return result.stream().map(OculosListDTO::new).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){

        List<OculosMinProjection> list = oculosRepository.searchByList(listId);

        OculosMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for(int i = min; i <= max; i++){
            oculosListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }

    @Transactional(readOnly = true)
    public OculosListDTO findById(Long listId){
        OculosList entity = oculosListRepository.findById(listId).get();
        return new OculosListDTO(entity);
    }
}
