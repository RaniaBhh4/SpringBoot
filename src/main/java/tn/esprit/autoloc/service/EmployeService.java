package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.repository.EmployeRepository;

import java.util.List;

public class EmployeService implements IEmployeService{

    EmployeRepository emRepo;

    @Override
    public List<Employe> retrieveAllEmployes() {

        return (List<Employe>) emRepo.findAll();
    }

    @Override
    public Employe addEmploye(Employe e) {

        return emRepo.save(e);
    }

    @Override
    public Employe updateEmploye(Employe e) {

        return emRepo.save(e);
    }

    @Override
    public Object retrieveEmploye(Long idEmploye) {

        return emRepo.findById(idEmploye);
    }

    @Override
    public void removeEmploye(Long idEmploye) {

        emRepo.deleteById(idEmploye);
    }

    @Override
    public List<Employe> addEmployes(List<Employe> employes) {

        return (List<Employe>) emRepo.saveAll(employes);
    }
}
