package edu.miu.cs.cs401.project.domain;

import java.util.ArrayList;
import java.util.List;

public class Agent {
	private String id;
	private String name;
	private List<Passenger> passengers=new ArrayList<>();
	
	public Agent(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public List<Passenger> getPassengers(){
		return passengers;
	}
	public void addPassengers (Passenger passenger){
		passengers.add(passenger);
	}
	

	@Override
	public String toString() {
		return "Agent [Id= " + this.id + " , Name=" + this.name + " ]";
	}

}
