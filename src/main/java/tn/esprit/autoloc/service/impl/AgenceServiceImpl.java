package tn.esprit.autoloc.service.impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.repository.agenceRepository;
import tn.esprit.autoloc.service.interfaces.IAgenceService;
import java.util.List;


@Service

public class AgenceServiceImpl implements IAgenceService {

    private final agenceRepository agenceRepo;

    public AgenceServiceImpl(agenceRepository agenceRepo) {
        this.agenceRepo = agenceRepo;
    }

    @Override
    public Agence addAgence(Agence agence) { return agenceRepo.save(agence); }

    @Override
    public List<Agence> retrieveAllAgences() { return agenceRepo.findAll(); }

    @Override
    public Agence retrieveAgence(Long id) { return agenceRepo.findById(id).orElse(null); }

    @Override
    public Agence updateAgence(Agence agence) { return agenceRepo.save(agence); }

    @Override
    public void removeAgence(Long id) { agenceRepo.deleteById(id); }
}