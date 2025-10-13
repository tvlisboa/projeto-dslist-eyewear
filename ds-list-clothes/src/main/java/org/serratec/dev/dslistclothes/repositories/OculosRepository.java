package org.serratec.dev.dslistclothes.repositories;
import org.serratec.dev.dslistclothes.entities.Oculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OculosRepository extends JpaRepository<Oculos, Long> {
}
