package org.serratec.dev.dslistclothes.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_oculos")
public class Oculos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "oculos_year")
    private Integer year;
    private String genre;
    private Double reviewScore;
    private String imgUrl;

    @Column(length = 150)
    private String shortDescription;

    @Column(length = 500)
    private String longDescription;

    public Oculos() {
    }

    public Oculos(Long id, String name, Integer year,
                  String genre, Double review_score,
                  String img_url, String shortDescription,
                  String longDescription) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.reviewScore = reviewScore;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Oculos oculos = (Oculos) o;
        return Objects.equals(id, oculos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
