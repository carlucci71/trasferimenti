package it.daniele.transfermarket.repository;

import it.daniele.transfermarket.entity.Squadra;
import it.daniele.transfermarket.entity.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SquadraRepository extends JpaRepository<Squadra, Long> {
    // Puoi aggiungere query personalizzate qui se necessario
}
