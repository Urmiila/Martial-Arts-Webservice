package com.MAC.Martial.Arts.WebApplication.Model;

import jakarta.persistence.Id;

public class Contact {
	
	private String Firstname;
	private String Lastname;
	private String Country;
	@Id
	private String Email;
	private String  Message;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String firstname, String lastname, String country, String email, String message) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Country = country;
		Email = email;
		Message = message;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	@Override
	public String toString() {
		return "Contact [Firstname=" + Firstname + ", Lastname=" + Lastname + ", Country=" + Country + ", Email="
				+ Email + ", Message=" + Message + "]";
	}
	
	
	
	
}
