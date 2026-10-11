package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.entities.Agence;
import java.util.List;

public interface IAgenceService {
    Agence addAgence(Agence agence);
    List<Agence> retrieveAllAgences();
    Agence retrieveAgence(Long id);
    Agence updateAgence(Agence agence);
    void removeAgence(Long id);
}