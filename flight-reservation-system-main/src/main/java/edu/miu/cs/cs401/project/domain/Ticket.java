
package edu.miu.cs.cs401.project.domain;
import java.util.UUID;

public class Ticket {
	String id;
	String number;
	FlightInstance flightInstance;
	Reservation reservation;

	public Ticket(FlightInstance flightInstance, Reservation reservation) {
		this.flightInstance = flightInstance;
		this.reservation = reservation;
		this.id = UUID.randomUUID().toString();
		this.number = UUID.randomUUID().toString();
	}

	public void setFlight(FlightInstance flight) {
		this.flightInstance = flight;
	}

	public String getid() {
		return id;
	}

	public String getnumber() {
		return number;
	}

	@Override
	public String toString() {
		return "[ Id : " + this.id + ", ticket number : " + this.number+ " ]";
	}
}

