package edu.miu.cs.cs401.project.domain;

public class Crew extends Person{
	public Crew (String id, String name) {
		super(id,name);
	}
	@Override
	public String toString() {
		return "Crew [Id= " + Id + ", name = " + name + " ]";
	}          
}
