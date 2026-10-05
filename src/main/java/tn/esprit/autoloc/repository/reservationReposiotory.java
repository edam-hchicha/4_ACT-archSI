package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Paiement;
import tn.esprit.autoloc.entities.Reservation;

public interface reservationReposiotory extends JpaRepository<Reservation,Long> {
}
