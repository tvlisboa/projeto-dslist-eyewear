package org.serratec.dev.dslistclothes.repositories;
import org.serratec.dev.dslistclothes.entities.OculosList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Dentro do repository
 * temos duas referencias discritas
 * para o tipo da entidade e o tipo do id
 */

@Repository
public interface OculosListRepository extends JpaRepository<OculosList, Long> {

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND oculos_id = :oculosId")
    void updateBelongingPosition(Long listId, Long oculusId, Integer newPosition);

}
