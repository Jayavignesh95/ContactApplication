package com.model;

import com.googlecode.objectify.ObjectifyService;

public class OfyHelper {
	public OfyHelper() {
		ObjectifyService.register(com.app.LoginDetails.class);
		ObjectifyService.register(Contact.class);
	}
}
