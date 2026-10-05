package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"reservation", "paiements"})
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    @OneToOne
    private Reservation reservation;
    @OneToMany(mappedBy = "contrat", cascade = CascadeType.PERSIST)
    private Set<Paiement> paiements;
}