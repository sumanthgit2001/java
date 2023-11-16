package com.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
@Entity
public class Employee {
	@Id
	//@GeneratedValue
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	
//	
//	@GeneratedValue(strategy=GenerationType.AUTO, generator="emp_gen")
//	
//	
//	
//	
//	@SequenceGenerator(name="emp_gen",
//						initialValue=101,
//						allocationSize=1,
//						sequenceName="Emp_seq_generation_table")
	private int empid;
	
	private String name;
	private String department;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
