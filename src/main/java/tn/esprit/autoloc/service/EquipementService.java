package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.EquipementRepository;

import java.util.List;

public class EquipementService implements IEquipementService{

    EquipementRepository eqRepo;

    @Override
    public List<Equipement> retrieveAllEquipements() {

        return (List<Equipement>) eqRepo.findAll();
    }

    @Override
    public Equipement addEquipement(Equipement e) {

        return eqRepo.save(e);
    }

    @Override
    public Equipement updateEquipement(Equipement e) {

        return eqRepo.save(e);
    }

    @Override
    public Object retrieveEquipement(Long idEquipement) {

        return eqRepo.findById(idEquipement);
    }

    @Override
    public void removeEquipement(Long idEquipement) {

        eqRepo.deleteById(idEquipement);
    }

    @Override
    public List<Equipement> addEquipements(List<Equipement> equipements) {
        return (List<Equipement>) eqRepo.saveAll(equipements);
    }
}
