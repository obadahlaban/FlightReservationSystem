package edu.miu.cs.cs401.project.service;

import edu.miu.cs.cs401.project.repository.RepositoryFactory;

public class ServiceFactory {
	
	private static ReservationSystemService reservationSystemService = 
			new ReservationSystemServiceImpl(RepositoryFactory.getReservationSystemRepository());
	
	public static ReservationSystemService getReservationSystemService() {
		return reservationSystemService;		
	}
}
