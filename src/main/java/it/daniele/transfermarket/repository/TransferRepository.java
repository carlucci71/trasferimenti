package it.daniele.transfermarket.repository;

import it.daniele.transfermarket.entity.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, String> {
    // Puoi aggiungere query personalizzate qui se necessario
}
