package com.packk;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private String name;
	private String profile;
	public Person(String name, String profile) {
		super();
		this.name = name;
		this.profile = profile;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", profile=" + profile + "]";
	}
	

}
