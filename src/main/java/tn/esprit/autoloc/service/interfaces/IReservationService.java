package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.entities.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    List<Reservation> retrieveAllReservations();
    Reservation retrieveReservation(Long id);
    Reservation updateReservation(Reservation reservation);
    void removeReservation(Long id);
}