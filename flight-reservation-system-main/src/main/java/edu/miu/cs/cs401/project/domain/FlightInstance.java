package edu.miu.cs.cs401.project.domain;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FlightInstance {
	
	private Flight flight;
	private String id;
	private LocalDate date;
	private List<Pilot> pilots;
	private List<Crew> crew;
	private List<Ticket>tickets=new ArrayList<>();

	public FlightInstance(Flight flight,String id, LocalDate date) {
		super();
		this.flight=flight;
		this.id = id;
		this.date = date;
		pilots = new ArrayList<>();
		crew = new ArrayList<>();
		flight.addFlightInstance(this);
	}

	public Flight getFlight() {
		return this.flight;
	}

	public void setFlight(Flight flight) {
		this.flight=flight;
	}
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<Pilot> getPilots() {
		return pilots;
	}

	public void addPilots(Pilot p) {
		pilots.add(p);
	}

	public List<Crew> getCrew() {
		return crew;
	}

	public void addCrew(Crew c) {
		crew.add(c);
	}
	
	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}

	@Override
	public String toString() {
		return "[ ID = " + this.id + " , Date = " + this.date + ", pilots=" + this.pilots.toString() + ", Crew = " + this.crew.toString()+ " ]";
	}

}
