package edu.miu.cs.cs401.project.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Passenger {
	private String id;
	private String firstName;
	private String lastName;
	private LocalDate dOB;
	private String email;
	private List<Reservation> reservations;
	private Address residanceAddress;
	private Agent agent;

	public Passenger(String id, String firstName, String lastName, LocalDate dOB, String email,Address residenceAdress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dOB = dOB;
		this.email = email;
		reservations = new ArrayList<Reservation>();
		this.residanceAddress=residenceAdress;
	}
	public Passenger(Agent agent, String id, String firstName, String lastName, LocalDate dOB, String email,Address residenceAdress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dOB = dOB;
		this.email = email;
		reservations = new ArrayList<Reservation>();
		this.residanceAddress=residenceAdress;
		this.agent=agent;
	}
	public Passenger inputPassenger() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id=?");
		String id=sc.nextLine();
		System.out.println("firstName=?");
		String firstName=sc.nextLine();
		System.out.println("lastName=?");
		String lastName=sc.nextLine();
		System.out.println("dOB=?");
		System.out.println("day=?");
		int day=sc.nextInt();
		System.out.println("month=?");
		int month=sc.nextInt();
		System.out.println("year=?");
		int year=sc.nextInt();
		LocalDate dob=LocalDate.of(year, month, day);
		System.out.println("email=?");
		String email=sc.nextLine();
		Address a=new Address();
		a=a.inputAddress();
		sc.close();
		return new Passenger( id, firstName, lastName, dob, email,a);
	}
public Passenger(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDOB() {
		return dOB;
	}

	public void setDOB(LocalDate dOB) {
		this.dOB = dOB;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public Address getResidanceAddress() {
		return residanceAddress;
	}
	public void addReservation(Reservation reservation) {
		reservations.add(reservation);
	}
	public void removeReservation(Reservation reservation) {
		reservations.remove(reservation);
	}

	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	@Override
	public String toString() {
		return "Passenger [id = " + id + " , FirstName = " + firstName + " , LastName = " + lastName + " , DOB=" + dOB
				+ " , Email=" + email + " ]";
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

}
