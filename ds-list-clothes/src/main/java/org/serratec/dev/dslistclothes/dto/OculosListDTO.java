package org.serratec.dev.dslistclothes.dto;

import org.serratec.dev.dslistclothes.entities.OculosList;
import org.springframework.beans.BeanUtils;

/**
 * Quando utilizado o metodo com BEANUTILS
 * para copiar os atributos de uma classe
 * devemos usar o getter e setter
 */

public class OculosListDTO {
    private Long id;
    private String name;

    public OculosListDTO() {
    }

    public OculosListDTO(OculosList entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
