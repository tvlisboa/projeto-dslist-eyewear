package org.serratec.dev.dslistclothes.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_shoes_list")
public class ShoesList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public ShoesList() {
    }

    public ShoesList(String name, Long id) {
        this.name = name;
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ShoesList shoesList = (ShoesList) o;
        return Objects.equals(id, shoesList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
