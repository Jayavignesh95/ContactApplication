package com.app;

import com.googlecode.objectify.annotation.Entity;

@Entity
public class LoginDetails {
private String userId;
private String pass;
public LoginDetails(String userId, String pass) {
	this.userId=userId;
	this.pass=pass;
}
public LoginDetails() {
	
}
public String getuserId() {
	return userId;
}
public void setuserId(String emailId) {
	this.userId = emailId;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

}
