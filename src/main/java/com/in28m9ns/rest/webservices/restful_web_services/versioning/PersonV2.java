package com.in28m9ns.rest.webservices.restful_web_services.versioning;

public class PersonV2 {

	private PersonName name;

	public PersonV2(PersonName name) {
		super();
		this.name = name;
	}

	public PersonName getName() {
		return name;
	}

	@Override
	public String toString() {
		return "PersonV2 [name=" + name + "]";
	}
	
	
	
}
