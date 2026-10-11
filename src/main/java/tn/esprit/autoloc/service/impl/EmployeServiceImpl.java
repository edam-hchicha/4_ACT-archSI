package tn.esprit.autoloc.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.repository.employeRepository;
import tn.esprit.autoloc.service.interfaces.IEmployeService;
import java.util.List;

@Service
public class EmployeServiceImpl implements IEmployeService {

    private final employeRepository employeRepo;

    public EmployeServiceImpl(employeRepository employeRepo) {
        this.employeRepo = employeRepo;
    }

    @Override
    public Employe addEmploye(Employe employe) { return employeRepo.save(employe); }

    @Override
    public List<Employe> retrieveAllEmployes() { return employeRepo.findAll(); }

    @Override
    public Employe retrieveEmploye(Long id) { return employeRepo.findById(id).orElse(null); }

    @Override
    public Employe updateEmploye(Employe employe) { return employeRepo.save(employe); }

    @Override
    public void removeEmploye(Long id) { employeRepo.deleteById(id); }
}