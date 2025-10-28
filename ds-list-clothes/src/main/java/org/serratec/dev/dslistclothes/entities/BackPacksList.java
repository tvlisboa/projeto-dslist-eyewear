package org.serratec.dev.dslistclothes.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_backpacks_list")
public class BackPacksList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelName;

    public BackPacksList(){
    }

    public BackPacksList(Long id,
                         String modelName) {
        this.id = id;
        this.modelName = modelName;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BackPacksList that = (BackPacksList) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
