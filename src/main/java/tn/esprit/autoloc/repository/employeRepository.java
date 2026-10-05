package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.entities.Vehicule;

public interface employeRepository extends JpaRepository<Employe,Long> {
}
