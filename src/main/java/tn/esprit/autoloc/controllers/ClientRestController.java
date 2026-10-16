package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.service.interfaces.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientRestController {

    private final IClientService clientService;

    // GET: http://localhost:8080/client/retrieve-all-clients
    @GetMapping("/retrieve-all-clients")
    public List<Client> retrieveAllClients() {
        return clientService.retrieveAllClients();
    }

    // GET: http://localhost:8080/client/retrieve-client/1
    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        return clientService.retrieveClient(clientId);
    }

    // POST: http://localhost:8080/client/add-client
    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    // PUT: http://localhost:8080/client/update-client
    @PutMapping("/update-client")
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    // DELETE: http://localhost:8080/client/remove-client/1
    @DeleteMapping("/remove-client/{client-id}")
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientService.removeClient(clientId);
    }
}