package org.serratec.dev.dslistclothes.dto;

import org.serratec.dev.dslistclothes.entities.Shoes;

public class ShoesMinDTO {
    private Long id;
    private String modelName;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    private Double price;

    public ShoesMinDTO(){
    }

    public ShoesMinDTO(Shoes entity){
        id = entity.getId();
        modelName = entity.getModelName();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        price = entity.getPrice();
    }

    public Long getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
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
