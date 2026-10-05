package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.entities.Maintenance;

public interface maintenanceRepository extends JpaRepository<Maintenance,Long> {
}
