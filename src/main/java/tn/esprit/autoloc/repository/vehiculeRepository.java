package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.entities.Vehicule;

public interface vehiculeRepository extends JpaRepository<Vehicule,Long> {
}
