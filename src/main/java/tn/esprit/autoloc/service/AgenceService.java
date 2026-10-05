package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.repository.AgenceRepository;

import java.util.List;

public class AgenceService implements IAgenceService{

    AgenceRepository agRepo;

    @Override
    public List<Agence> retrieveAllAgences() {
        return (List<Agence>) agRepo.findAll();
    }

    @Override
    public Agence addAgence(Agence a) {
        return agRepo.save(a);
    }

    @Override
    public Agence updateAgence(Agence a) {
        return agRepo.save(a);
    }

    @Override
    public Object retrieveAgence(Long idAgence) {
        return agRepo.findById(idAgence);
    }

    @Override
    public void removeAgence(Long idAgence) {
agRepo.deleteById(idAgence);
    }

    @Override
    public List<Agence> addAgences(List<Agence> agences) {
        return (List<Agence>) agRepo.saveAll(agences);
    }
}
