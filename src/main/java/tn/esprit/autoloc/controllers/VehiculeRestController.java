package tn.esprit.autoloc.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.service.interfaces.IVehiculeService;

import java.util.List;

@Tag(name = "Gestion des Véhicules")
@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeRestController {

    private final IVehiculeService vehiculeService;

    @Operation(description = "Récupérer la liste des véhicules")
    @GetMapping("/retrieve-all-vehicules")
    public List<Vehicule> retrieveAllVehicules() {
        return vehiculeService.retrieveAllVehicules();
    }

    @Operation(description = "Récupérer un véhicule par son ID")
    @GetMapping("/retrieve-vehicule/{vehicule-id}")
    public Vehicule retrieveVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        return vehiculeService.retrieveVehicule(vehiculeId);
    }

    @Operation(description = "Ajouter un nouveau véhicule")
    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicule(vehicule);
    }

    @Operation(description = "Mettre à jour un véhicule")
    @PutMapping("/update-vehicule")
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

    @Operation(description = "Supprimer un véhicule")
    @DeleteMapping("/remove-vehicule/{vehicule-id}")
    public void removeVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        vehiculeService.removeVehicule(vehiculeId);
    }
}