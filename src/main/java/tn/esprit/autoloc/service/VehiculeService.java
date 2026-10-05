package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repository.VehiculeRepository;

import java.util.List;

public class VehiculeService implements IVehiculeService{

    VehiculeRepository veRepo;

    @Override
    public List<Vehicule> retrieveAllVehicules() {

        return (List<Vehicule>) veRepo.findAll();
    }

    @Override
    public Vehicule addVehicule(Vehicule v) {

        return veRepo.save(v);
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {

        return veRepo.save(v);
    }

    @Override
    public Object retrieveVehicule(Long idVehicule) {

        return veRepo.findById(idVehicule);
    }

    @Override
    public void removeVehicule(Long idVehicule) {

        veRepo.deleteById(idVehicule);
    }

    @Override
    public List<Vehicule> addVehicules(List<Vehicule> vehicules) {

        return (List<Vehicule>) veRepo.saveAll(vehicules);
    }
}
