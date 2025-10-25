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
            select tb_oculos.id, tb_oculos.name, tb_oculos.oculos_year, tb_oculos.genre, tb_oculos.review_score, 
                               tb_oculos.cost_price, tb_oculos.price, tb_oculos.img_url, 
                                           tb_oculos.short_description, tb_oculos.long_description, TB_BELONGING.position
            from tb_oculos
            inner join TB_BELONGING on tb_oculos.id = TB_BELONGING.oculos_id
            WHERE TB_BELONGING.LIST_ID = :listId
            ORDER BY TB_BELONGING.position
            """)
    List<OculosMinProjection> searchByList(Long listId);


}
