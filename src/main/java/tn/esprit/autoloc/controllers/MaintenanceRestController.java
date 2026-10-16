package tn.esprit.autoloc.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Maintenance;
import tn.esprit.autoloc.service.interfaces.IMaintenanceService;

import java.util.List;

@Tag(name = "Gestion des Maintenances")
@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceRestController {

    private final IMaintenanceService maintenanceService;

    @Operation(description = "Récupérer l'historique des maintenances")
    @GetMapping("/retrieve-all-maintenances")
    public List<Maintenance> retrieveAllMaintenances() {
        return maintenanceService.retrieveAllMaintenances();
    }

    @Operation(description = "Récupérer une maintenance par ID")
    @GetMapping("/retrieve-maintenance/{maintenance-id}")
    public Maintenance retrieveMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        return maintenanceService.retrieveMaintenance(maintenanceId);
    }

    @Operation(description = "Enregistrer une maintenance")
    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.addMaintenance(maintenance);
    }

    @Operation(description = "Mettre à jour une maintenance")
    @PutMapping("/update-maintenance")
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }

    @Operation(description = "Supprimer une fiche de maintenance")
    @DeleteMapping("/remove-maintenance/{maintenance-id}")
    public void removeMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        maintenanceService.removeMaintenance(maintenanceId);
    }
}