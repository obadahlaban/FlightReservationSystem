package edu.miu.cs.cs401.project.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalTime;  
import java.time.LocalDate;

import edu.miu.cs.cs401.project.domain.Address;
import edu.miu.cs.cs401.project.domain.Airline;
import edu.miu.cs.cs401.project.domain.Airport;
import edu.miu.cs.cs401.project.domain.Flight;
import edu.miu.cs.cs401.project.domain.Passenger;
import edu.miu.cs.cs401.project.domain.Reservation;
import edu.miu.cs.cs401.project.domain.Agent;
import edu.miu.cs.cs401.project.domain.Crew;
import edu.miu.cs.cs401.project.domain.Pilot;
import edu.miu.cs.cs401.project.domain.FlightInstance;


public class ReservationSystemRepositoryImpl implements ReservationSystemRepository {
	
	private Map<String, Airport> airports = new HashMap<>();

	private Map<String, Airline> airlines = new HashMap<>();

	private Map<Flight, FlightInstance> flights = new HashMap<>();

	private Map<Integer, Passenger> passengers = new HashMap<>();
	
	private Map<String, Agent> agents = new HashMap<>();
	
	private Map<String,Reservation> reservations = new HashMap<>();
	
	private List<Crew> crewMembers= new ArrayList<>();
	
	private List<Pilot> pilots= new ArrayList<>();
	
	ReservationSystemRepositoryImpl() {
		super();
		setupAirports();
		setupAirlines();
		setupFlights();
		setupCrew();
		setupPilots();
		
	}
	
	private void setupAirports() {
		
		Airport airport;
		
		airport = new Airport("CID", "Eastern Iowa Airport", new Address());
		airports.put(airport.getCode(), airport);
		
		airport = new Airport("ORD", "Chicago O'Hare International Airport", new Address());
		airports.put(airport.getCode(), airport);
		
		airport = new Airport("CLT", "Charlotte Douglas International Airport", new Address());
		airports.put(airport.getCode(), airport);
		
		airport = new Airport("LAX", "Los Angeles International Airport", new Address());
		airports.put(airport.getCode(), airport);

		airport = new Airport("JFK", "John F. Kennedy International Airport", new Address());
		airports.put(airport.getCode(), airport);

		airport = new Airport("DFW", "Dallas/Fort Worth International Airport", new Address());
		airports.put(airport.getCode(), airport);
		
	}
	private void setupAirlines() {
		
		Airline airline;

		airline = new Airline("1","AA", "American Airlines", "");
		airlines.put(airline.getID(), airline);
		
		airline = new Airline("2","SA","Southwest Airlines", "");
		airlines.put(airline.getID(), airline);
		
		airline = new Airline("3","JB", "Jet Blue", "");
		airlines.put(airline.getID(), airline);

		airline = new Airline("4","DA", "Delta Airlines", "");
		airlines.put(airline.getID(), airline);

		airline = new Airline("5","UA", "United Airlines", "");
		airlines.put(airline.getID(), airline);
		
	}
	private void setupFlights() {
		Flight flight1 = new Flight("flight1", 1, 230,  LocalTime.of(10,45,00),  LocalTime.of(15,45,00),airlines.get("1"), airports.get("CID"), airports.get("ORD"));
		FlightInstance flightInstance1=new FlightInstance(flight1, "1", LocalDate.of(2020, 1, 13));
		flightInstance1.addCrew(crewMembers.get(0));
		flightInstance1.addCrew(crewMembers.get(1));
		flightInstance1.addCrew(crewMembers.get(2));
		flight1.addFlightInstance(flightInstance1);

		flightInstance1=new FlightInstance(flight1, "2", LocalDate.of(2020, 1, 23));
		flightInstance1.addCrew(crewMembers.get(3));
		flightInstance1.addCrew(crewMembers.get(1));
		flightInstance1.addCrew(crewMembers.get(4));
		flight1.addFlightInstance(flightInstance1);

		flightInstance1=new FlightInstance(flight1, "3", LocalDate.of(2020, 2, 17));
		flightInstance1.addCrew(crewMembers.get(2));
		flightInstance1.addCrew(crewMembers.get(4));
		flightInstance1.addCrew(crewMembers.get(1));
		flight1.addFlightInstance(flightInstance1);

		Flight flight2 = new Flight("flight2", 2, 120,  LocalTime.of(12,45,00),  LocalTime.of(20,45,00), airlines.get("2"), airports.get("CID"), airports.get("JFK"));
		Flight flight3 = new Flight("flight3", 3, 250,  LocalTime.of(19,00,00),  LocalTime.of(22,45,00), airlines.get("3"), airports.get("DFW"), airports.get("LAX"));
		Flight flight4 = new Flight("flight4", 4, 61,  LocalTime.of(8,05,00),  LocalTime.of(10,45,00), airlines.get("4"), airports.get("DFW"), airports.get("CLT"));
		Flight flight5 = new Flight("flight5", 5, 97,  LocalTime.of(17,30,00),  LocalTime.of(23,45,00), airlines.get("5"), airports.get("CLT"), airports.get("CID"));

	}
	private void setupCrew() {
		Crew crew;
		crew = new Crew("C001", "LACHHAB AYOUB");
		crewMembers.add(crew);
		crew = new Crew("C002", "Michael Jackson");
		crewMembers.add(crew);
		crew = new Crew("C003", "Morgan Freeman");
		crewMembers.add(crew);
		crew = new Crew("C004", "Elvis Presly");
		crewMembers.add(crew);
		crew = new Crew("C005", "The Animals");
		crewMembers.add(crew);
	}

	private void setupPilots() {
		Pilot pilot;
		pilot = new Pilot("P001", "LACHHAB AYOUB");
		pilots.add(pilot);
		pilot = new Pilot("P002", "Whip Banana");
		pilots.add(pilot);
		pilot = new Pilot("P003", "Ricardo  kaka");
		pilots.add(pilot);
		pilot = new Pilot("P004", "Not  Abanana");
		pilots.add(pilot);
		pilot = new Pilot("P005", "Catherine Mccarthy");
		pilots.add(pilot);

	}
		

	@Override
	public Collection<Airport> findAllAirports() {
		return airports.values();
	}

	@Override
	public Airport findAirportByAirportCode(String airportCode) {
		for(Airport airport : findAllAirports()) {
			if(airport.getCode().equalsIgnoreCase(airportCode)) {
				return airport;
			}
		}
		return null;
	}

	@Override
	public Collection<Airport> findAirportsByCity(String city) {
		List<Airport> res=new ArrayList<>();
		for(Airport ap : findAllAirports()) {
			if(ap.getAddress().getCity().equalsIgnoreCase(city)) {
				res.add(ap);
			}
		}
		return res;
	}

	@Override
	public Collection<Airline> findAirlinesByAirportCode(String airportCode) {
		Airport airport= findAirportByAirportCode(airportCode);
		if(airport == null)
			return new ArrayList<>();
		Map<String, Airline> airlines = new HashMap<>();
		List<Flight> flights = airport.getDepartureFlights();		
		for (Flight flight: flights) {
			Airline airline=flight.getAirline();			
			airlines.put(airline.getAirlineCode(), airline);
		}
		return airlines.values();
	}

	@Override
	public Collection<Flight> findFlightsFromTo (Airport departure, Airport arrival) {
		List<Flight> result = new ArrayList<>();
		for (FlightInstance f:flights.values()){
			if ((f.getFlight().getDepAirport()==departure)&&(f.getFlight().getArrAirport()==arrival)) result.add(f.getFlight());
		}
		return result;
	}

	@Override
	public Collection<Reservation> findReservationsByPassengerId (String passengerId) {
		List<Reservation> result = new ArrayList<>();
		for (Reservation r:reservations.values()){
			if (r.getPassenger().getId().equalsIgnoreCase(passengerId)) result.add(r);
		}
		return result;
		

	}

	@Override
	public Collection<Passenger> findPassengersByAgentCode(String agentCode) {
		for (Agent a:agents.values()){
			if (a.getId().equalsIgnoreCase(agentCode)) return a.getPassengers();
		}
		return null;
	}

	public void addAirport(Airport a){
		this.airports.put(a.getId(), a);
	}

	public void deleteAirport(Airport a){
		this.airports.remove(a.getId(), a);
	}

	public void addAirline(Airline a){
		this.airlines.put(a.getID(),a);
	}

	public void deleteAirline(Airline a){
		this.airlines.remove(a.getID(), a);
	}

	public void addFlightToAirline(String airlineID,Flight f){
		this.airlines.get(airlineID).addFlight(f);
	}

	public void deleteFlightFromAirline(String airlineID,Flight f){
		this.airlines.get(airlineID).delFlight(f);
	}

	public void addFlightInstanceToFlight(Flight flight,FlightInstance flightInstance){
		Flight old=flight;
		flight.addFlightInstance(flightInstance);

		while (flights.remove(old)!=null){
			flights.remove(old);
		}
		for(FlightInstance inst:flight.getFlightInstances()){
		this.flights.put(flight,inst);
		}
	}

	public void deleteFlightInstanceFromFlight(Flight flight,FlightInstance flightInstance){
		Flight old=flight;
		flight.deleteFlightInstance(flightInstance);

		while (flights.remove(old)!=null){
			flights.remove(old);
		}
		for(FlightInstance inst:flight.getFlightInstances()){
		this.flights.put(flight,inst);
		}
		
	}
		
	public void cancelReservation(String reservationCode) {
		Reservation reservation =reservations.get(reservationCode);
		reservation.setTickets(null);
		Passenger passenger= reservation.getPassenger();
		passenger.removeReservation(reservation);
		
		reservations.remove(reservationCode);
	}

	public static void main (String[] args){
		ReservationSystemRepositoryImpl c= new ReservationSystemRepositoryImpl();
		System.out.println(c.findAirportByAirportCode("CID"));
		System.out.println(c.findAirportsByCity("CID"));
	}

	@Override
	public void addFlightToAirline(Flight f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFlightFromAirline(Flight f) {
		// TODO Auto-generated method stub
		
	}

}
