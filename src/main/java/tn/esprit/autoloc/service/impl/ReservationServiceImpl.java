package tn.esprit.autoloc.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.repository.reservationReposiotory;
import tn.esprit.autoloc.service.interfaces.IReservationService;
import java.util.List;

@Service
public class ReservationServiceImpl implements IReservationService {

    private final reservationReposiotory reservationRepo;

    public ReservationServiceImpl(reservationReposiotory reservationRepo) {
        this.reservationRepo = reservationRepo;
    }

    @Override
    public Reservation addReservation(Reservation reservation) { return reservationRepo.save(reservation); }

    @Override
    public List<Reservation> retrieveAllReservations() { return reservationRepo.findAll(); }

    @Override
    public Reservation retrieveReservation(Long id) { return reservationRepo.findById(id).orElse(null); }

    @Override
    public Reservation updateReservation(Reservation reservation) { return reservationRepo.save(reservation); }

    @Override
    public void removeReservation(Long id) { reservationRepo.deleteById(id); }
}