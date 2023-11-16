package com.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
@Entity
@Table(name="employee_generation_type_sequence")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="gen_tab_tab")
	@TableGenerator(name="gen_tab_tab",
					table="gen_tab_tab_seq",
					initialValue=1,
					allocationSize=1)
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
