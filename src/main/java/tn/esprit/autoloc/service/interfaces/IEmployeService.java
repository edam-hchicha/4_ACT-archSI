package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.entities.Employe;
import java.util.List;

public interface IEmployeService {
    Employe addEmploye(Employe employe);
    List<Employe> retrieveAllEmployes();
    Employe retrieveEmploye(Long id);
    Employe updateEmploye(Employe employe);
    void removeEmploye(Long id);
}