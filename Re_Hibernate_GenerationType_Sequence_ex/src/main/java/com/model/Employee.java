package com.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="employee_generation_type_sequence")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_gen")
	@SequenceGenerator(name="seq_gen",
						initialValue=1,
						allocationSize=1,
						sequenceName="sequence_gen_seq_tab")
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
