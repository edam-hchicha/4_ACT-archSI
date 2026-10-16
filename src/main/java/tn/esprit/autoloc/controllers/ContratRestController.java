package tn.esprit.autoloc.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.service.interfaces.IContratService;

import java.util.List;

@Tag(name = "Gestion des Contrats")
@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {

    private final IContratService contratService;

    @Operation(description = "Récupérer tous les contrats")
    @GetMapping("/retrieve-all-contrats")
    public List<Contrat> retrieveAllContrats() {
        return contratService.retrieveAllContrats();
    }

    @Operation(description = "Récupérer un contrat par son ID")
    @GetMapping("/retrieve-contrat/{contrat-id}")
    public Contrat retrieveContrat(@PathVariable("contrat-id") Long contratId) {
        return contratService.retrieveContrat(contratId);
    }

    @Operation(description = "Créer un nouveau contrat")
    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        return contratService.addContrat(contrat);
    }

    @Operation(description = "Modifier un contrat existant")
    @PutMapping("/update-contrat")
    public Contrat updateContrat(@RequestBody Contrat contrat) {
        return contratService.updateContrat(contrat);
    }

    @Operation(description = "Supprimer un contrat")
    @DeleteMapping("/remove-contrat/{contrat-id}")
    public void removeContrat(@PathVariable("contrat-id") Long contratId) {
        contratService.removeContrat(contratId);
    }
}