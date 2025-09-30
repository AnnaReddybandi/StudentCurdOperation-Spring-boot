package com.spring.Handling;

public class StudentNotFound extends RuntimeException {

	
	private String mesg;

	public String getMesg() {
		return mesg;
	}

	public void setMesg(String mesg) {
		this.mesg = mesg;
	}
	
}
