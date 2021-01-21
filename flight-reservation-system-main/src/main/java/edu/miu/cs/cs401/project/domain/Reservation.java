package edu.miu.cs.cs401.project.domain;

import java.util.List;

import edu.miu.cs.cs401.project.costant.Status;

public class Reservation {
	List<Ticket> tickets;
	String reservationId;
	String agentId=null;
	Passenger passenger;
	private Status status=Status.NONE;

	public Reservation(List<Ticket> tickets, String reservationId, String agentId, Passenger passenger) {
		super();
		this.tickets = tickets;
		this.reservationId = reservationId;
		this.agentId = agentId;
		this.passenger = passenger;
	}
	public Reservation(List<Ticket> tickets, String reservationId,Passenger passenger) {
		super();
		this.tickets = tickets;
		this.reservationId = reservationId;	
		this.passenger = passenger;
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

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public void confirm() {
		this.status=Status.CONFIRM_PURCHASE;
	}

	@Override
	public String toString() {
		String s="ReservationId = " + reservationId + "\nPassenger = " + passenger + "\nTickets = " + getTickets();
		if (agentId==null) return s;
		return "Agent Id = "+this.agentId+ "\n"+s;//why we have this
	}
	
}
