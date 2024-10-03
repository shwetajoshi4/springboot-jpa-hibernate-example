package com.in28m9ns.rest.webservices.restful_web_services.versioning;

public class PersonName {
	
	private String firstName;
	
	private String lastName;

	public PersonName(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "personName [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
