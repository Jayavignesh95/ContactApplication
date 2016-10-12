package com.app;

import com.googlecode.objectify.annotation.Entity;

@Entity
public class LoginDetails {
private String emailId;
private String pass;
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

}
