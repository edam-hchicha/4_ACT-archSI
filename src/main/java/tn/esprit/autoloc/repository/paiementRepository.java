package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.entities.Paiement;

public interface paiementRepository extends JpaRepository<Paiement,Long> {
}
