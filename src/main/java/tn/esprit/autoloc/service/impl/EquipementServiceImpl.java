package tn.esprit.autoloc.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.repository.equipementRepository;
import tn.esprit.autoloc.service.interfaces.IEquipementService;
import java.util.List;

@Service
public class EquipementServiceImpl implements IEquipementService {

    private final equipementRepository equipementRepo;

    public EquipementServiceImpl(equipementRepository equipementRepo) {
        this.equipementRepo = equipementRepo;
    }

    @Override
    public Equipement addEquipement(Equipement equipement) { return equipementRepo.save(equipement); }

    @Override
    public List<Equipement> retrieveAllEquipements() { return equipementRepo.findAll(); }

    @Override
    public Equipement retrieveEquipement(Long id) { return equipementRepo.findById(id).orElse(null); }

    @Override
    public Equipement updateEquipement(Equipement equipement) { return equipementRepo.save(equipement); }

    @Override
    public void removeEquipement(Long id) { equipementRepo.deleteById(id); }
}