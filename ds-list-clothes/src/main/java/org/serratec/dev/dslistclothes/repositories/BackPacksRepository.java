package org.serratec.dev.dslistclothes.repositories;

import org.serratec.dev.dslistclothes.entities.BackPacks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BackPacksRepository extends JpaRepository<BackPacks, Long> {
}
