package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat addContrat(Contrat contrat);
    List<Contrat> retrieveAllContrats();
    Contrat retrieveContrat(Long id);
    Contrat updateContrat(Contrat contrat);
    void removeContrat(Long id);
}