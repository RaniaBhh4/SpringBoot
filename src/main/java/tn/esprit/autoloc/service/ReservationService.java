package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.repository.ReservationRepository;

import java.util.List;

public class ReservationService implements IReservationService{

    ReservationRepository reRepo;

    @Override
    public List<Reservation> retrieveAllReservations() {

        return (List<Reservation>) reRepo.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {

        return reRepo.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {

        return reRepo.save(r);
    }

    @Override
    public Object retrieveReservation(Long idReservation) {

        return reRepo.findById(idReservation);
    }

    @Override
    public void removeReservation(Long idReservation) {

        reRepo.deleteById(idReservation);
    }

    @Override
    public List<Reservation> addReservations(List<Reservation> reservations) {
        return (List<Reservation>) reRepo.saveAll(reservations);
    }
}
