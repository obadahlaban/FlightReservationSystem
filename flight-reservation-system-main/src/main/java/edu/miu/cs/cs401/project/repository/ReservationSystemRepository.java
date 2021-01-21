package edu.miu.cs.cs401.project.repository;

import java.util.Collection;

import edu.miu.cs.cs401.project.domain.Airline;
import edu.miu.cs.cs401.project.domain.Airport;
import edu.miu.cs.cs401.project.domain.Flight;
import edu.miu.cs.cs401.project.domain.Passenger;
import edu.miu.cs.cs401.project.domain.Reservation;
import edu.miu.cs.cs401.project.domain.FlightInstance;

public interface ReservationSystemRepository {
	
	Collection<Airport> findAllAirports();
	
	Airport findAirportByAirportCode(String airportCode);
	
	Collection<Airport> findAirportsByCity(String city); // Airport(s) of a city, e.g. Chicago has two major airports
	
	Collection<Airline> findAirlinesByAirportCode(String airportCode);
	
	Collection<Flight> findFlightsFromTo(Airport departure, Airport arrival);
	
	Collection<Reservation> findReservationsByPassengerId(String passengerId);
	
	Collection<Passenger> findPassengersByAgentCode(String agentCode);
	
	void cancelReservation(String reservationCode);
	
	void confirmReservation(String reservationCode);

	void addAirport(Airport a);

	void deleteAirport(Airport a);

	void addAirline(Airline a);

	void deleteAirline(Airline a);

	void addFlightToAirline(String airlineID,Flight f);

	void deleteFlightFromAirline(String airlineID, Flight f);

	void addFlightInstanceToFlight(Flight flight,FlightInstance flightInstance);

	void deleteFlightInstanceFromFlight(Flight flight,FlightInstance flightInstance);

}