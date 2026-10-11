package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.entities.Client;
import java.util.List;

public interface IClientService {
    Client addClient(Client client);
    List<Client> retrieveAllClients();
    Client retrieveClient(Long id);
    Client updateClient(Client client);
    void removeClient(Long id);
}