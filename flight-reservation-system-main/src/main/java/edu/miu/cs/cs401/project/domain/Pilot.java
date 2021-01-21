package edu.miu.cs.cs401.project.domain;


public class Pilot extends Person{
	public Pilot (String id, String name) {
		super(id,name);
	}
	@Override
	public String toString() {
		return "Pilot [Id= " + Id + ", name = " + name + " ]";
	}
}
