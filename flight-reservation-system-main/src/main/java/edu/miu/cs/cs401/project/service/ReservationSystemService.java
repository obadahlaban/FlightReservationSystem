package edu.miu.cs.cs401.project.service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import edu.miu.cs.cs401.project.domain.Agent;
import edu.miu.cs.cs401.project.domain.Airline;
import edu.miu.cs.cs401.project.domain.Airport;
import edu.miu.cs.cs401.project.domain.Flight;
import edu.miu.cs.cs401.project.domain.Passenger;
import edu.miu.cs.cs401.project.domain.Reservation;
import edu.miu.cs.cs401.project.domain.FlightInstance;

public interface ReservationSystemService {
	
	Collection<Airport> findAllAirports();
	
	Airport findAirportByAirportCode(String airportCode);
	
	Collection<Airport> findAirportsByCity(String city); // Airport(s) of a city, e.g. Chicago has two major airports
	
	Collection<Airline> findAirlinesByAirportCode(String airportCode);
	
	Collection<FlightInstance> findFlightsFromTo(String departure, String arrival, LocalDate flightDate);
	
	Collection<Reservation> findReservationsByPassengerId(String passengerId);
	
	Collection<Passenger> findPassengersByAgentCode(String agentCode);
	
	Reservation createReservation(Passenger passenger, List<String> flights); // Passenger reserves
	
	Reservation createReservation(Agent agent, Passenger passenger, Collection<FlightInstance> flights); // Agent reserves
	
	void confirmReservation(String reservationCode);
	
	void confirmReservation(String reservationCode, String agentCode);
	
	void cancelReservation(String reservationCode);

	
	
}
