package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.autoloc.entities.enums.StatutReservation;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"vehicule", "client", "contrat"})
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;
    @ManyToOne
    private Vehicule vehicule;
    @ManyToOne
    private Client client;
    @OneToOne(mappedBy = "reservation", cascade = CascadeType.PERSIST)
    private Contrat contrat;
}