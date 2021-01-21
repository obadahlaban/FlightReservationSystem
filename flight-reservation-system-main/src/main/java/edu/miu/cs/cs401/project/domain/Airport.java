package edu.miu.cs.cs401.project.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Airport {
	
	private  String id;
	
	private String code;
	
	private String name;
	
	private Address address;
	
	private List <Flight> departureFlights = new ArrayList<>();
    private List <Flight> arrivalFlights = new ArrayList<>();
	

	public Airport(String code, String name, Address address) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.id = UUID.randomUUID().toString();
	}
	public Airport inputAirport(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code");
		String code=sc.nextLine().trim();
		System.out.println("Enter name");
		String name=sc.nextLine().trim();
		System.out.println("Enter address");
		Address a= new Address();
		a.inputAddress();
		sc.close();
		return new Airport( code,  name,  a);


	}
	public Airport(){

	}

	public String getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public void addDepartureFlight(Flight flightDepature) {
        departureFlights.add(flightDepature);      
    }
	public void addArrivalFlight(Flight flightarrival) {
        departureFlights.add(flightarrival);
        
    }
	


	public List<Flight> getDepartureFlights() {
		return departureFlights;
	}

	public List<Flight> getArrivalFlights() {
		return arrivalFlights;
	}

	@Override
	public String toString() {
		return "Airport [id=" + id + ", code=" + code + ", name=" + name + ", Address=" + address + "]";
	}

}
