package tn.esprit.autoloc.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Paiement;
import tn.esprit.autoloc.service.interfaces.IPaiementService;

import java.util.List;

@Tag(name = "Gestion des Paiements")
@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementRestController {

    private final IPaiementService paiementService;

    @Operation(description = "Récupérer la liste des paiements")
    @GetMapping("/retrieve-all-paiements")
    public List<Paiement> retrieveAllPaiements() {
        return paiementService.retrieveAllPaiements();
    }

    @Operation(description = "Récupérer un paiement par son ID")
    @GetMapping("/retrieve-paiement/{paiement-id}")
    public Paiement retrievePaiement(@PathVariable("paiement-id") Long paiementId) {
        return paiementService.retrievePaiement(paiementId);
    }

    @Operation(description = "Enregistrer un nouveau paiement")
    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return paiementService.addPaiement(paiement);
    }

    @Operation(description = "Mettre à jour un paiement")
    @PutMapping("/update-paiement")
    public Paiement updatePaiement(@RequestBody Paiement paiement) {
        return paiementService.updatePaiement(paiement);
    }

    @Operation(description = "Supprimer un paiement")
    @DeleteMapping("/remove-paiement/{paiement-id}")
    public void removePaiement(@PathVariable("paiement-id") Long paiementId) {
        paiementService.removePaiement(paiementId);
    }
}