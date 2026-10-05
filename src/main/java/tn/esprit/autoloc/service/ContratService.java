package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.ContratRepository;

import java.util.List;

public class ContratService implements IContratService{

    ContratRepository coRepo;

    @Override
    public List<Contrat> retrieveAllContrats() {

        return (List<Contrat>) coRepo.findAll();
    }

    @Override
    public Contrat addContrat(Contrat c) {

        return coRepo.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {

        return coRepo.save(c);
    }

    @Override
    public Object retrieveContrat(Long idContrat) {

        return coRepo.findById(idContrat);
    }

    @Override
    public void removeContrat(Long idContrat) {

        coRepo.deleteById(idContrat);
    }

    @Override
    public List<Contrat> addContrats(List<Contrat> contrats) {

        return (List<Contrat>) coRepo.saveAll(contrats);
    }
}
