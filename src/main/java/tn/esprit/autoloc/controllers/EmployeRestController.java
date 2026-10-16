package tn.esprit.autoloc.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.service.interfaces.IEmployeService;

import java.util.List;

@Tag(name = "Gestion des Employés")
@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeRestController {

    private final IEmployeService employeService;

    @Operation(description = "Récupérer la liste des employés")
    @GetMapping("/retrieve-all-employes")
    public List<Employe> retrieveAllEmployes() {
        return employeService.retrieveAllEmployes();
    }

    @Operation(description = "Récupérer un employé par son ID")
    @GetMapping("/retrieve-employe/{employe-id}")
    public Employe retrieveEmploye(@PathVariable("employe-id") Long employeId) {
        return employeService.retrieveEmploye(employeId);
    }

    @Operation(description = "Ajouter un employé")
    @PostMapping("/add-employe")
    public Employe addEmploye(@RequestBody Employe employe) {
        return employeService.addEmploye(employe);
    }

    @Operation(description = "Mettre à jour un employé")
    @PutMapping("/update-employe")
    public Employe updateEmploye(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @Operation(description = "Supprimer un employé")
    @DeleteMapping("/remove-employe/{employe-id}")
    public void removeEmploye(@PathVariable("employe-id") Long employeId) {
        employeService.removeEmploye(employeId);
    }
}