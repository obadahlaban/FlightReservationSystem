package edu.miu.cs.cs401.project.domain;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Flight {
	private String id;
	private int number;
	private int capacity;
	private LocalTime deptime;
	private LocalTime arrivtime;
	private Airport depAirport;
	private Airport arrAirport;
	private List<FlightInstance> flightInstances = new ArrayList<>();
	private Airline airline;
	


	public Flight(String id, int number, int capacity, LocalTime deptime, LocalTime arrivtime,Airline airline,Airport depAirport,Airport arrAirport) 
	{
		super();
		this.id = id;
		this.number = number;
		this.capacity = capacity;
		this.deptime = deptime;
		this.arrivtime = arrivtime;
		this.airline=airline;
		this.depAirport=depAirport;
		this.arrAirport=arrAirport;
	}

	public Flight inputFlight(){
		Scanner sc = new Scanner(System.in);
		System.out.println("id=?");
		String id=sc.nextLine();
		System.out.println("number=?");
		int number=sc.nextInt();
		System.out.println("capacity=?");
		int capacity=sc.nextInt();
		System.out.println("deptime=?");
		System.out.println("hour=?");
		int hour=sc.nextInt();
		System.out.println("minute=?");
		int minute=sc.nextInt();
		System.out.println("second=?");
		int second=sc.nextInt();
		LocalTime deptime=LocalTime.of(hour, minute, second);
		System.out.println("arrivtime=?");
		System.out.println("hour=?");
		hour=sc.nextInt();
		System.out.println("minute=?");
		minute=sc.nextInt();
		System.out.println("second=?");
		second=sc.nextInt();
		LocalTime arrivtime=LocalTime.of(hour, minute, second);
		System.out.println("Airline=?");
		Airline al=new Airline();
		Airline airline=al.inputAirline();
		System.out.println("depAirport=?");
		Airport a=new Airport();
		Airport depAirport=a.inputAirport();
		System.out.println("arrAirport=?");
		Airport arrAirport=a.inputAirport();
		sc.close();
		return new Flight( id, number, capacity, deptime, arrivtime,airline,depAirport,arrAirport);

	}
	public Flight(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public LocalTime getDeptime() {
		return deptime;
	}

	public void setDeptime(LocalTime deptime) {
		this.deptime = deptime;
	}

	public LocalTime getArrivtime() {
		return arrivtime;
	}

	public void setArrivtime(LocalTime arrivtime) {
		this.arrivtime = arrivtime;
	}

	public Airport getDepAirport(){
		return depAirport;
	}
	
	public void setDepAirport(Airport depAirport){
		this.depAirport=depAirport;
	}
	
	public Airport getArrAirport(){
		return this.arrAirport;
	}
	
	public void setArrAirport(Airport arrAirport){
		this.arrAirport=arrAirport;
	}
	
	public List<FlightInstance> getFlightInstances() {
		return flightInstances;
	}

	public void addFlightInstance(FlightInstance fi) {
		this.flightInstances.add(fi);
	}
	public void deleteFlightInstance(FlightInstance fi) {
		this.flightInstances.remove(fi);
	}

	public Airline getAirline() {
		return airline;
	}
	
	public String toString(){
		return "Flight [id= "+id+" , number = " +number+" , capacity = "+capacity+" , depAirport = "+this.depAirport+ " , arrAirport = "+this.arrAirport +" , deptime = "+ deptime+" , arrivtime = "+ arrivtime;	
	}	
}
