package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.repository.PaiementRepository;

import java.util.List;

public class PaiementService implements IPaiementService{

    PaiementRepository paRepo;

    @Override
    public List<Paiement> retrieveAllPaiements() {

        return (List<Paiement>) paRepo.findAll();
    }

    @Override
    public Paiement addPaiement(Paiement p) {

        return paRepo.save(p);
    }

    @Override
    public Paiement updatePaiement(Paiement p) {

        return paRepo.save(p);
    }

    @Override
    public Object retrievePaiement(Long idPaiement) {

        return paRepo.findById(idPaiement);
    }

    @Override
    public void removePaiement(Long idPaiement) {

        paRepo.deleteById(idPaiement);
    }

    @Override
    public List<Paiement> addPaiements(List<Paiement> paiements) {

        return (List<Paiement>) paRepo.saveAll(paiements);
    }
}
