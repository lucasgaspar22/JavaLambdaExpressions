package model;

import java.util.Date;

public class Customer {
	
	
	private Long id;
	private String name;
	private Date birthDate;
	private String gender;

	public Customer(Long id, String name, Date birthDate, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Name: "+ this.name + ", Birth: "+this.birthDate.toString()+", Gender: "+this.gender;
	}
	
}
