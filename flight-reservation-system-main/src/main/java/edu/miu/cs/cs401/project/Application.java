package edu.miu.cs.cs401.project;

import java.util.Scanner;

import edu.miu.cs.cs401.project.service.ReservationSystemService;
import edu.miu.cs.cs401.project.service.ServiceFactory;

public class Application {

	public static void main(String[] args) {
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
