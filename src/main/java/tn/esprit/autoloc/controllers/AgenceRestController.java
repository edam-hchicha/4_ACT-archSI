package tn.esprit.autoloc.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.service.interfaces.IAgenceService;

import java.util.List;

@Tag(name = "Gestion des Agences")
@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceRestController {

    private final IAgenceService agenceService;

    @Operation(description = "Récupérer la liste de toutes les agences")
    @GetMapping("/retrieve-all-agences")
    public List<Agence> retrieveAllAgences() {
        return agenceService.retrieveAllAgences();
    }

    @Operation(description = "Récupérer une agence par son identifiant")
    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long agenceId) {
        return agenceService.retrieveAgence(agenceId);
    }

    @Operation(description = "Ajouter une nouvelle agence")
    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    @Operation(description = "Mettre à jour les informations d'une agence")
    @PutMapping("/update-agence")
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    @Operation(description = "Supprimer une agence par son identifiant")
    @DeleteMapping("/remove-agence/{agence-id}")
    public void removeAgence(@PathVariable("agence-id") Long agenceId) {
        agenceService.removeAgence(agenceId);
    }
}