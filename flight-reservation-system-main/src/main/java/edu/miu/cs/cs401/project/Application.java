package edu.miu.cs.cs401.project;

import java.util.Scanner;

import edu.miu.cs.cs401.project.service.ReservationSystemService;
import edu.miu.cs.cs401.project.service.ServiceFactory;
import edu.miu.cs.cs401.project.repository.RepositoryFactory; 
import edu.miu.cs.cs401.project.repository. ReservationSystemRepository;
import edu.miu.cs.cs401.project.domain.Address;
import edu.miu.cs.cs401.project.domain.Airline;
import edu.miu.cs.cs401.project.domain.Airport;
import edu.miu.cs.cs401.project.domain.Flight;
import edu.miu.cs.cs401.project.domain.Passenger;
import edu.miu.cs.cs401.project.domain.Reservation;
import edu.miu.cs.cs401.project.domain.Ticket;
import edu.miu.cs.cs401.project.domain.Agent;
import edu.miu.cs.cs401.project.domain.Crew;
import edu.miu.cs.cs401.project.domain.Pilot;
import edu.miu.cs.cs401.project.domain.FlightInstance;

public class Application {

	public static void main(String[] args) {

		ReservationSystemRepository repository=RepositoryFactory.getReservationSystemRepository();
		System.out.println("Airline Reservation System");
		System.out.println();
		System.out.println("Input 1 to log in as administrator");
		System.out.println("Input 2 to continue as Passenger");
		System.out.println("Input 3 to continue as Agent");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		 int i = sc.nextInt();

		 if (i==1) {		
		System.out.println("Input 1 to add Airport");
		System.out.println("Input 2 to add Airline");
		System.out.println("Input 3 to delete Airline");
		System.out.println("Input 4 to add flight to airline");
		System.out.println("Input 5 to delete Flight From Airline");
		System.out.println("Input 6 to add flightInstance To flight");
		System.out.println("Input 7 to delete FlightInstance From Flight");
		System.out.println("Input 0 to go back to main menu");
		System.out.println();
		int	j = sc.nextInt();
		switch (j){
			case 1:
			Airport a=new Airport();
			a=a.inputAirport();
			repository.addAirport(a);
			System.out.println(a+" added successfully");
			break;
		  	case 2:
			  Airline al=new Airline();
			  al=al.inputAirline();
			  repository.addAirline(al);
			  System.out.println(al+" added successfully");
			break;
			case 3:
			Airline al1=new Airline();
			al1=al1.inputAirline();
			  repository.deleteAirline(al1);
			  System.out.println(al1+" deleted successfully");
			break;
			case 4:
			Flight f=new Flight();
			f=f.inputFlight();
			System.out.println("airline id?");
			String id=sc.nextLine();
			repository.addFlightToAirline(id, f);
			System.out.println(f+" added successfully to "+id);
			break;
			case 5:
			Flight f1=new Flight();
			f1=f1.inputFlight();
			System.out.println("airline id?");
			String id1=sc.nextLine();
			repository.deleteFlightFromAirline(id1, f1);
			System.out.println(f1+" deleted successfully from "+id1);
			break;
			case 6:
			Flight f2=new Flight();
			f2=f2.inputFlight();
			FlightInstance f3=new FlightInstance();
			f3=f3.inputFlightInstance();
			repository.addFlightInstanceToFlight(f2, f3);
			System.out.println(f3+" added successfully to "+f2);
			break;
			case 7:
			Flight f4=new Flight();
			f4=f4.inputFlight();
			FlightInstance f5=new FlightInstance();
			f5=f5.inputFlightInstance();
			repository.addFlightInstanceToFlight(f4, f5);
			System.out.println(f5+" added successfully to "+f4);
			break;
			case 0:
			// code block
			break;
		  	default:
			// code block
		}
		 }
		 
		if (i==2) {
		//if passenger
		System.out.println("Input 1 to view list of airports");
		System.out.println("Input 2 to view airport by code");
		System.out.println("Input 3 to view list of airports in city");
		System.out.println("Input 4 to view the list of airline in airport");
		System.out.println("Input 5 to view the list of flights from an airport to another in a particular date");
		System.out.println("Input 6 to view the list of all reservations");
		System.out.println("Input 7 to make a reservation");
		System.out.println("Input 8 to confirm a reservation");
		System.out.println("Input 9 to cancel a reservation");
		System.out.println("Input 0 to go back to main menu");
		System.out.println();
		int j = sc.nextInt();
		switch (j){
			case 1:
			// code block
			break;
		  	case 2:
			// code block
			break;
			case 3:
			// code block
			break;
			case 4:
			// code block
			break;
			case 5:
			// code block
			break;
			case 6:
			// code block
			break;
			case 7:
			// code block
			break;
			case 8:
			// code block
			break;
			case 9:
			// code block
			break;
			case 0:
			// code block
			break;
		  	default:
			// code block
		}
		}
		if (i==3) {
		//if agent
		System.out.println("Input 1 to view list of airports");
		System.out.println("Input 2 to view airport by code");
		System.out.println("Input 3 to view list of airports in city");
		System.out.println("Input 4 to view the list of airline in airport");
		System.out.println("Input 5 to view the list of flights from an airport to another in a particular date");
		System.out.println("Input 6 to view the list of all reservations");
		System.out.println("Input 7 to view the list of passengers by agent code");
		System.out.println("Input 8 to make a reservation");
		System.out.println("Input 9 to confirm a reservation");
		System.out.println("Input 10 to cancel a reservation");
		System.out.println("Input 0 to go back to main menu");
		System.out.println();
		int j = sc.nextInt();
		switch (j){
			case 1:
			// code block
			break;
		  	case 2:
			// code block
			break;
			case 3:
			// code block
			break;
			case 4:
			// code block
			break;
			case 5:
			// code block
			break;
			case 6:
			// code block
			break;
			case 7:
			// code block
			break;
			case 8:
			// code block
			break;
			case 9:
			// code block
			break;
			case 10:
			// code block
			break;
			case 0:
			// code block
			break;
		  	default:
			// code block
		}
		}	
		



		
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
