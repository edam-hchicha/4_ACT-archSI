package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.entities.Paiement;
import java.util.List;

public interface IPaiementService {
    Paiement addPaiement(Paiement paiement);
    List<Paiement> retrieveAllPaiements();
    Paiement retrievePaiement(Long id);
    Paiement updatePaiement(Paiement paiement);
    void removePaiement(Long id);
}