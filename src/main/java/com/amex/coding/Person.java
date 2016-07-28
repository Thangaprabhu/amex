package com.amex.coding;

public class Person {

	private String name;
	private byte age;
	private String address;
	private String city;
	private String state;
	private short zip;

	public Person(String name, byte age, String address, String city, String state, short zip) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public int hashCode() {
		return 7 * name.hashCode() * age * address.hashCode() * city.hashCode() * state.hashCode() * zip;
	}

	@Override
	public boolean equals(Object person) {
		if (null == person || person.getClass() != Person.class) {
			return false;
		}
		Person p = (Person) person;
		return this.name.equals(p.name) && this.age == p.age && this.address.equals(p.address)
				&& this.city.equals(p.city) && this.state.equals(p.state) && this.zip == p.zip;
	}

}
