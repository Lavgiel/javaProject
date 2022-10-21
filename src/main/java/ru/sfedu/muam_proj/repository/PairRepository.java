package ru.sfedu.muam_proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sfedu.muam_proj.model.Pair;

public interface PairRepository extends JpaRepository<Pair, Long> {
}
