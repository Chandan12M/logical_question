package com.number;

import java.io.Serializable;

public class Emp implements Serializable{
	private int id;
	private String desig;
	
	public Emp(int id, String desig) {
		super();
		this.id = id;
		this.desig = desig;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", desig=" + desig + "]";
	}
	

}
