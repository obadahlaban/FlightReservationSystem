package edu.miu.cs.cs401.project.domain;

import java.util.Scanner;

public class Address {
	
	private String id;
	private String street;
	
	private String city;
	
	private String state;
	
	private String zip;

	public Address(String id,String street,String city,String state,String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.id = id;
	}
	public Address(){

	}
	public Address inputAddress(){
		Scanner sc = new Scanner(System.in);
		System.out.println("id=?");
		String idi=sc.nextLine();
		System.out.println("street=?");
		String streeti=sc.nextLine();
		System.out.println("city=?");
		String cityi=sc.nextLine();
		System.out.println("state=?");
		String statei=sc.nextLine();
		System.out.println("zip=?");
		String zipi=sc.nextLine();
		sc.close();
		return new Address( idi, streeti, cityi, statei, zipi);

	}

	public String getId() {
		return id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	

}
