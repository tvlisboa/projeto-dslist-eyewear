package org.serratec.dev.dslistclothes.repositories;
import org.serratec.dev.dslistclothes.entities.Oculos;
import org.serratec.dev.dslistclothes.projections.OculosMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Dentro do repository
 * temos duas referencias discritas
 * para o tipo da entidade e o tipo do id
 */

@Repository
public interface OculosRepository extends JpaRepository<Oculos, Long> {

    @Query(nativeQuery = true, value = """
            SELECT tb_oculos.id, tb_oculos.name, tb_oculos.oculos_year AS oculosYear, tb_oculos.genre, tb_oculos.review_score AS reviewScore, 
                               tb_oculos.cost_price as costPrice, tb_oculos.price, tb_oculos.img_url as imgUrl, 
                                           tb_oculos.short_description as shortDescription, tb_oculos.long_description longDescription, TB_BELONGING.position
            FROM tb_oculos
            INNER JOIN TB_BELONGING on tb_oculos.id = TB_BELONGING.oculos_id
            WHERE TB_BELONGING.LIST_ID = :listId
            ORDER BY TB_BELONGING.position
                """)
    List<OculosMinProjection> searchByList(Long listId);
}
