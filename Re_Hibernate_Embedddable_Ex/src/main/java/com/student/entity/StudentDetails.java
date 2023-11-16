package com.student.entity;

import jakarta.persistence.*;


@Entity
public class StudentDetails {
	
	private TypeOfNames sname;
	@Id
	private int roll;
	private int marks;
	
	
 
	public TypeOfNames getSname() {
		return sname;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setSname(TypeOfNames typename) {
		this.sname=typename;
	}
	
	
}
