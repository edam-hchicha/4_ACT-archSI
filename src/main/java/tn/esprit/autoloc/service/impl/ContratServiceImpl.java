package tn.esprit.autoloc.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.repository.contratRepository;
import tn.esprit.autoloc.service.interfaces.IContratService;
import java.util.List;

@Service
public class ContratServiceImpl implements IContratService {

    private final contratRepository contratRepo;

    public ContratServiceImpl(contratRepository contratRepo) {
        this.contratRepo = contratRepo;
    }

    @Override
    public Contrat addContrat(Contrat contrat) { return contratRepo.save(contrat); }

    @Override
    public List<Contrat> retrieveAllContrats() { return contratRepo.findAll(); }

    @Override
    public Contrat retrieveContrat(Long id) { return contratRepo.findById(id).orElse(null); }

    @Override
    public Contrat updateContrat(Contrat contrat) { return contratRepo.save(contrat); }

    @Override
    public void removeContrat(Long id) { contratRepo.deleteById(id); }
}