package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.entities.Maintenance;

public interface equipementRepository extends JpaRepository<Equipement,Long> {
}
