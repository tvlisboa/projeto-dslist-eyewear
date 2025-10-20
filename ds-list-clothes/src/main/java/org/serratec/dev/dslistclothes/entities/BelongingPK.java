package org.serratec.dev.dslistclothes.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

/**
 * Faz referencias as duas chaves primarias
 * Do oculos e da Lista de oculos
 */

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "oculos_id")
    private Oculos oculos;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private OculosList list;

    public BelongingPK() {
    }

    public BelongingPK(Oculos oculos,
                       OculosList list) {
        this.oculos = oculos;
        this.list = list;
    }

    public Oculos getOculos() {
        return oculos;
    }

    public void setOculos(Oculos oculos) {
        this.oculos = oculos;
    }

    public OculosList getList() {
        return list;
    }

    public void setList(OculosList list) {
        this.list = list;
    }

    /**
     * Quando utilizamos chaves primarias multiplas
     * devemos fazer a comparacao com equals aos dois atributos
     * no caso a seguir, foram as classes OCULOS e LIST
     */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(oculos, that.oculos) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oculos, list);
    }
}
