package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.entities.Vehicule;
import java.util.List;

public interface IVehiculeService {
    Vehicule addVehicule(Vehicule vehicule);
    List<Vehicule> retrieveAllVehicules();
    Vehicule retrieveVehicule(Long id);
    Vehicule updateVehicule(Vehicule vehicule);
    void removeVehicule(Long id);
}