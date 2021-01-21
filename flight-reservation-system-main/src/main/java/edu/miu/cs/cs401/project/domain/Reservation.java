package edu.miu.cs.cs401.project.domain;

import java.util.List;
import java.util.UUID;

import edu.miu.cs.cs401.project.costant.Status;

public class Reservation {
	private List<Ticket> tickets;
	private String reservationId;
	private Agent agent;
	private Passenger passenger;
	private Status status=Status.NONE;

	public Reservation(Passenger passenger) {
		this.reservationId = UUID.randomUUID().toString();
		this.passenger=passenger;
	}
	public Reservation(Passenger passenger,Agent agent) {
		this.reservationId = UUID.randomUUID().toString();
		this.passenger=passenger;
		this.agent=agent;
		
	}
	
	public Status getStatus() {
		return status;
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

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
		
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public void confirm() {
		this.status=Status.CONFIRMED_RESERVATION;
	}

	@Override
	public String toString() {
		String s="ReservationId = " + reservationId + "\nPassenger = " + passenger + "\nTickets = " + getTickets();
		if (agent.getId()==null) return s;
		return "Agent Id = "+this.agent.getId()+ "\n"+s;//why we have this
	}
	
}
