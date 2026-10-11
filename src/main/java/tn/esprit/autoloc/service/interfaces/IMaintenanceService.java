package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.entities.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance addMaintenance(Maintenance maintenance);
    List<Maintenance> retrieveAllMaintenances();
    Maintenance retrieveMaintenance(Long id);
    Maintenance updateMaintenance(Maintenance maintenance);
    void removeMaintenance(Long id);
}