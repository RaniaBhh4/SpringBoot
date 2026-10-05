package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.repository.MaintenanceRepository;

import java.util.List;

public class MaintenanceService implements IMaintenanceService{

    MaintenanceRepository maRepo;

    @Override
    public List<Maintenance> retrieveAllMaintenances() {

        return (List<Maintenance>) maRepo.findAll();
    }

    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return maRepo.save(m);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance m) {

        return maRepo.save(m);
    }

    @Override
    public Object retrieveMaintenance(Long idMaintenance) {

        return maRepo.findById(idMaintenance);
    }

    @Override
    public void removeMaintenance(Long idMaintenance) {

        maRepo.deleteById(idMaintenance);
    }

    @Override
    public List<Maintenance> addMaintenances(List<Maintenance> maintenances) {
        return (List<Maintenance>) maRepo.saveAll(maintenances);
    }
}
