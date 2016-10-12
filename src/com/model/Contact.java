package com.model;

import java.util.ArrayList;

import com.googlecode.objectify.annotation.Entity;

@Entity
public class Contact {
	String userName;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	String email;
	String FirstName;
	String LastName;
	ArrayList<String> mobileNo = new ArrayList<String>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public ArrayList<String> getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String MobileNo) {
		mobileNo.add(MobileNo);
	}

	Contact(String email, String FirstName, String LastName, String MobileNo) {
		this.email = email;
		this.FirstName = FirstName;
		this.LastName = LastName;
		// MobileNo = (ArrayList<String>) MobileNo.clone();\
		mobileNo.add(MobileNo);
  
	
	}

}
