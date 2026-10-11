package tn.esprit.autoloc.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.repository.vehiculeRepository;
import tn.esprit.autoloc.service.interfaces.IVehiculeService;
import java.util.List;

@Service
public class VehiculeServiceImpl implements IVehiculeService {

    private final vehiculeRepository vehiculeRepo;

    public VehiculeServiceImpl(vehiculeRepository vehiculeRepo) {
        this.vehiculeRepo = vehiculeRepo;
    }

    @Override
    public Vehicule addVehicule(Vehicule vehicule) { return vehiculeRepo.save(vehicule); }

    @Override
    public List<Vehicule> retrieveAllVehicules() { return vehiculeRepo.findAll(); }

    @Override
    public Vehicule retrieveVehicule(Long id) { return vehiculeRepo.findById(id).orElse(null); }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) { return vehiculeRepo.save(vehicule); }

    @Override
    public void removeVehicule(Long id) { vehiculeRepo.deleteById(id); }
}