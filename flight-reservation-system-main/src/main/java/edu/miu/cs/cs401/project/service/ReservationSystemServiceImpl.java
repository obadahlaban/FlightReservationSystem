package edu.miu.cs.cs401.project.service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;


import edu.miu.cs.cs401.project.domain.Agent;
import edu.miu.cs.cs401.project.domain.Airline;
import edu.miu.cs.cs401.project.domain.Airport;
import edu.miu.cs.cs401.project.domain.Flight;
import edu.miu.cs.cs401.project.domain.FlightInstance;
import edu.miu.cs.cs401.project.domain.Passenger;
import edu.miu.cs.cs401.project.domain.Reservation;
import edu.miu.cs.cs401.project.repository.ReservationSystemRepository;

public class ReservationSystemServiceImpl implements ReservationSystemService {
	
	private ReservationSystemRepository repository;
	
	ReservationSystemServiceImpl(ReservationSystemRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Collection<Airport> findAllAirports() {
		return repository.findAllAirports();
	}

	@Override
	public Airport findAirportByAirportCode(String airportCode) {
		return repository.findAirportByAirportCode(airportCode);
	}

	@Override
	public Collection<Airport> findAirportsByCity(String city) {
		return repository.findAirportsByCity(city);
	}

	@Override
	public Collection<Airline> findAirlinesByAirportCode(String airportCode) {
		return repository.findAirlinesByAirportCode(airportCode);
	}


	@Override
	public Collection<Reservation> findReservationsByPassengerId(String passengerId) {
		return repository.findReservationsByPassengerId(passengerId);
	}

	@Override
	public Collection<Passenger> findPassengersByAgentCode(String agentCode) {
		return repository.findPassengersByAgentCode(agentCode);
	}

	@Override
	public Reservation createReservation(Passenger passenger, List<String> flights) {
		return repository.makeReservationByPassenger(passenger, flights);
	}

	@Override
	public Reservation createReservation(Agent agent, Passenger passenger, Collection<FlightInstance> flights) {
		return repository.makeReservationByAgent(agent, passenger, flights);
	}

	@Override
	public void confirmReservation(String reservationCode) {
		repository.getReservations().get(reservationCode).confirm();
	}

	@Override
	public void cancelReservation(String reservationCode) {
		repository.cancelReservation(reservationCode);
	}

	@Override
	public Collection<FlightInstance> findFlightsFromTo(String departure, String arrival, LocalDate flightDate) {
		return repository.findFlightsFromTo(departure, arrival,flightDate);
	}

	@Override
	public void confirmReservation(String reservationCode, String agentCode) {
		repository.getReservations().get(reservationCode).confirm();
		repository.getReservations().get(reservationCode).setAgent(repository.getAgents().get(agentCode));
		
	}

}
