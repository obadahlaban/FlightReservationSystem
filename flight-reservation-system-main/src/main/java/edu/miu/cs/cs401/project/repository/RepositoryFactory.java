package edu.miu.cs.cs401.project.repository;

public class RepositoryFactory {
	
	private static ReservationSystemRepository reservationSystemRepository = new ReservationSystemRepositoryImpl();
	
	public static ReservationSystemRepository getReservationSystemRepository() {
		return reservationSystemRepository;
	}
	

}
