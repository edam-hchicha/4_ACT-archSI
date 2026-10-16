package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.service.interfaces.IAgenceService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")

public class AgenceRestController {
    private final IAgenceService agenceService;
@GetMapping("retrieve-all-agences")
public Set<Agence> retrieveAllAgences() {
    return (Set<Agence>) agenceService.retrieveAllAgences();
}
    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long agenceId) {
        return agenceService.retrieveAgence(agenceId);
    }
    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    // http://localhost:8080/agence/update-agence
    @PutMapping("/update-agence")
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    // http://localhost:8080/agence/remove-agence/1
    @DeleteMapping("/remove-agence/{agence-id}")
    public void removeAgence(@PathVariable("agence-id") Long agenceId) {
        agenceService.removeAgence(agenceId);
    }



}

