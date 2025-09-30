package com.spring.helper;

public class StudentResponseStructure<T> {

	private int statusCode;
	private String mesg;
	private T dara;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMesg() {
		return mesg;
	}
	public void setMesg(String mesg) {
		this.mesg = mesg;
	}
	public T getDara() {
		return dara;
	}
	public void setDara(T dara) {
		this.dara = dara;
	}
	
}
