package com.aneesh.service;



public class CustomerDetailsEntity {


	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String favouriteColour;
	
	public CustomerDetailsEntity() {
		
	}

	@Override
	public String toString() {
		return "CustomerDetailsEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", favouriteColour=" + favouriteColour + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFavouriteColour() {
		return favouriteColour;
	}

	public void setFavouriteColour(String favouriteColour) {
		this.favouriteColour = favouriteColour;
	}

	public int getId() {
		return id;
	}
	
	
}
