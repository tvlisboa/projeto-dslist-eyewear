package org.serratec.dev.dslistclothes.entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "tb_shoes")
public class Shoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "shoes_year")
    private Integer year;
    private String genre;
    private Double reviewScore;

    @Column(name = "cost_price")
    private Double costPrice;
    private Double price;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Shoes(){
    }

    public Shoes(Long id, String modelName, Integer year, String genre,
                 Double reviewScore, Double costPrice, Double price,
                 String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.modelName = modelName;
        this.year = year;
        this.genre = genre;
        this.reviewScore = reviewScore;
        this.costPrice = costPrice;
        this.price = price;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(Double reviewScore) {
        this.reviewScore = reviewScore;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Shoes shoes = (Shoes) o;
        return Objects.equals(id, shoes.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
