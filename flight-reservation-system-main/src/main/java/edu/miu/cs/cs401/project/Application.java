package edu.miu.cs.cs401.project;

import edu.miu.cs.cs401.project.service.ReservationSystemService;
import edu.miu.cs.cs401.project.service.ServiceFactory;

public class Application {

	public static void main(String[] args) {
		System.out.println("Airline Reservation System");
		System.out.println();
		System.out.println("Input 1 to log in as administrator");
		System.out.println("Input 2 to continue as Passenger");
		System.out.println("Input 3 to continue as Agent");
		//if admin
		System.out.println("Input 1 to add Airport");
		System.out.println("Input 2 to add Airline");
		System.out.println("Input 3 to delete Airline");
		System.out.println("Input 4 to add flight to airline");
		System.out.println("Input");
		System.out.println("Input");
		System.out.println("Input");
		void addAirport(Airport a);

	void deleteAirport(Airport a);

	void addAirline(Airline a);

	void deleteAirline(Airline a);

	void addFlightToAirline(Flight f);

	void deleteFlightFromAirline(Flight f);

	void addFlightInstanceToFlight(Flight flight,FlightInstance flightInstance);

	void deleteFlightInstanceFromFlight(Flight flight,FlightInstance flightInstance);



		
		/*
		 * ReservationSystemService service =
		 * ServiceFactory.getReservationSystemService();
		 * System.out.println(service.findAllAirports());
		 * 
		 * System.out.
		 * println(service.findAirportByAirportCode("CID"));
		 */
		
	}

}
