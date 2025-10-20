package org.serratec.dev.dslistclothes.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

/**
 * Criado a classe pertence para que
 * oculos ou outra classe jogo pertence a uma
 * determinada lista
 * Para fazer referencia as chaves dos oculos e da lista
 * chamaos aqui o PK
 */

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging (){
    }

    public Belonging(Oculos oculos,
                     OculosList list,
                     Integer position) {
        id.setOculos(oculos);
        id.setList(list);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * Comparacao das listas de pertencimentos
     * feito pelo ID
     */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
