package edu.miu.cs.cs401.project.domain;



public class Person {

	String Id;
	String name;

	
	public Person (String id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
