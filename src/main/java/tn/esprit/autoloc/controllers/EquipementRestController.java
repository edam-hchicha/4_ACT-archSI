package tn.esprit.autoloc.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.service.interfaces.IEquipementService;

import java.util.List;

@Tag(name = "Gestion des Équipements")
@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementRestController {

    private final IEquipementService equipementService;

    @Operation(description = "Récupérer tous les équipements")
    @GetMapping("/retrieve-all-equipements")
    public List<Equipement> retrieveAllEquipements() {
        return equipementService.retrieveAllEquipements();
    }

    @Operation(description = "Récupérer un équipement par son ID")
    @GetMapping("/retrieve-equipement/{equipement-id}")
    public Equipement retrieveEquipement(@PathVariable("equipement-id") Long equipementId) {
        return equipementService.retrieveEquipement(equipementId);
    }

    @Operation(description = "Ajouter un équipement")
    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    @Operation(description = "Modifier un équipement")
    @PutMapping("/update-equipement")
    public Equipement updateEquipement(@RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }

    @Operation(description = "Supprimer un équipement")
    @DeleteMapping("/remove-equipement/{equipement-id}")
    public void removeEquipement(@PathVariable("equipement-id") Long equipementId) {
        equipementService.removeEquipement(equipementId);
    }
}