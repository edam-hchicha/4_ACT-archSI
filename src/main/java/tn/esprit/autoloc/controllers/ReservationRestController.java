package tn.esprit.autoloc.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.service.interfaces.IReservationService;

import java.util.List;

@Tag(name = "Gestion des Réservations")
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    private final IReservationService reservationService;

    @Operation(description = "Récupérer toutes les réservations")
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> retrieveAllReservations() {
        return reservationService.retrieveAllReservations();
    }

    @Operation(description = "Récupérer une réservation par ID")
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") Long reservationId) {
        return reservationService.retrieveReservation(reservationId);
    }

    @Operation(description = "Créer une réservation")
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @Operation(description = "Modifier une réservation")
    @PutMapping("/update-reservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @Operation(description = "Annuler/Supprimer une réservation")
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") Long reservationId) {
        reservationService.removeReservation(reservationId);
    }
}