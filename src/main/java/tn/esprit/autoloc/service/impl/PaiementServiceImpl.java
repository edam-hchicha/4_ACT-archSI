package tn.esprit.autoloc.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Paiement;
import tn.esprit.autoloc.repository.paiementRepository;
import tn.esprit.autoloc.service.interfaces.IPaiementService;
import java.util.List;

@Service
public class PaiementServiceImpl implements IPaiementService {

    private final paiementRepository paiementRepo;

    public PaiementServiceImpl(paiementRepository paiementRepo) {
        this.paiementRepo = paiementRepo;
    }

    @Override
    public Paiement addPaiement(Paiement paiement) { return paiementRepo.save(paiement); }

    @Override
    public List<Paiement> retrieveAllPaiements() { return paiementRepo.findAll(); }

    @Override
    public Paiement retrievePaiement(Long id) { return paiementRepo.findById(id).orElse(null); }

    @Override
    public Paiement updatePaiement(Paiement paiement) { return paiementRepo.save(paiement); }

    @Override
    public void removePaiement(Long id) { paiementRepo.deleteById(id); }
}