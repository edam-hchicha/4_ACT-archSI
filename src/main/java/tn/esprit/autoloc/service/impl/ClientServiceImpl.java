package tn.esprit.autoloc.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.repository.clientRepository;
import tn.esprit.autoloc.service.interfaces.IClientService;
import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    private final clientRepository clientRepo;

    public ClientServiceImpl(clientRepository clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Client addClient(Client client) { return clientRepo.save(client); }

    @Override
    public List<Client> retrieveAllClients() { return clientRepo.findAll(); }

    @Override
    public Client retrieveClient(Long id) { return clientRepo.findById(id).orElse(null); }

    @Override
    public Client updateClient(Client client) { return clientRepo.save(client); }

    @Override
    public void removeClient(Long id) { clientRepo.deleteById(id); }
}