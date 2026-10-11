package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.entities.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement addEquipement(Equipement equipement);
    List<Equipement> retrieveAllEquipements();
    Equipement retrieveEquipement(Long id);
    Equipement updateEquipement(Equipement equipement);
    void removeEquipement(Long id);
}