package tn.esprit.autoloc.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.service.interfaces.IClientService;

import java.util.List;

@Tag(name = "Gestion des Clients")
@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientRestController {

    private final IClientService clientService;

    @Operation(description = "Récupérer tous les clients")
    @GetMapping("/retrieve-all-clients")
    public List<Client> retrieveAllClients() {
        return clientService.retrieveAllClients();
    }

    @Operation(description = "Récupérer un client par son ID")
    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        return clientService.retrieveClient(clientId);
    }

    @Operation(description = "Ajouter un client")
    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @Operation(description = "Modifier un client")
    @PutMapping("/update-client")
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @Operation(description = "Supprimer un client")
    @DeleteMapping("/remove-client/{client-id}")
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientService.removeClient(clientId);
    }
}