package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.entities.Employe;

public interface agenceRepository extends JpaRepository<Agence,Long> {
}
