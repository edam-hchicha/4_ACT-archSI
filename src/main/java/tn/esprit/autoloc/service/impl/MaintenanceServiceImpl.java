package tn.esprit.autoloc.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Maintenance;
import tn.esprit.autoloc.repository.maintenanceRepository;
import tn.esprit.autoloc.service.interfaces.IMaintenanceService;
import java.util.List;

@Service
public class MaintenanceServiceImpl implements IMaintenanceService {

    private final maintenanceRepository maintenanceRepo;

    public MaintenanceServiceImpl(maintenanceRepository maintenanceRepo) {
        this.maintenanceRepo = maintenanceRepo;
    }

    @Override
    public Maintenance addMaintenance(Maintenance maintenance) { return maintenanceRepo.save(maintenance); }

    @Override
    public List<Maintenance> retrieveAllMaintenances() { return maintenanceRepo.findAll(); }

    @Override
    public Maintenance retrieveMaintenance(Long id) { return maintenanceRepo.findById(id).orElse(null); }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) { return maintenanceRepo.save(maintenance); }

    @Override
    public void removeMaintenance(Long id) { maintenanceRepo.deleteById(id); }
}