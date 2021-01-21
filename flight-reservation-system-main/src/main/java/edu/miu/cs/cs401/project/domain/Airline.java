package edu.miu.cs.cs401.project.domain;

import java.util.ArrayList;
import java.util.List;

public class Airline {

	String ID;
	String AirlineCode;
	String name;
	String History;
	List<Flight> flights;
	
	
	public Airline(String iD, String airlineCode, String name, String history) {
		super();
		ID = iD;
		AirlineCode = airlineCode;
		this.name = name;
		History = history;
		this.flights = new ArrayList<Flight>();
	}
	
	
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getAirlineCode() {
		return AirlineCode;
	}
	public void setAirlineCode(String airlineCode) {
		AirlineCode = airlineCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHistory() {
		return History;
	}
	public void setHistory(String history) {
		History = history;
	}
	public void addFlight(Flight f){
		this.flights.add(f);
	}
	public void delFlight(Flight f){
		this.flights.remove(f);
	}
	@Override
	public String toString() {
		return "Airline [ID=" + ID + ", AirlineCode=" + AirlineCode + ", name=" + name + ", History="
				+ History + "]";
	}
}
