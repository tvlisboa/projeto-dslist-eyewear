package org.serratec.dev.dslistclothes.dto;

import org.serratec.dev.dslistclothes.entities.Oculos;

public class OculosMinDTO {
    private Long id;
    private String name;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    private Double price;

    public OculosMinDTO(){
    }

    /**
     * Instancia um OculosMinDTO,
     * copiando os atributos da entidade e o que
     * sera mostrado nas solicitacoes do usuario
     */

    public OculosMinDTO(Oculos entity) {
        id = entity.getId();
        name = entity.getName();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        price = entity.getPrice();
    }

    /**
     * O DTO, só utiliza GET pois ele ira receber os dados de outra entidade
     * nao ira fazer nenhum tipo de alteração ou substituicao
     * direta classe
     */

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Double getPrice() {
        return price;
    }
}
