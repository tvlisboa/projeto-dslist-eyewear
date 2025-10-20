package org.serratec.dev.dslistclothes.dto;

import org.serratec.dev.dslistclothes.entities.BackPacks;

public class BackPacksMinDTO {
    private Long id;
    private String modelName;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    private Double price;

    public BackPacksMinDTO() {
    }

    public BackPacksMinDTO(BackPacks entity) {
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

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
