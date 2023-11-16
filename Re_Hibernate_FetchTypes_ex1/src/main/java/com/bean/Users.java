//package com.bean;
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//@Entity
//@Table(name="users")
//public class Users {
//	@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
//	private int uid;
//	@Column(length=20)
//	private String name;
//	@Column(length=20)
//	private String eduaction;
//	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinTable(name="User_Laps", joinColumns = {@JoinColumn(name="uid")}, inverseJoinColumns= {@JoinColumn(name="lid")})
//	private List<Laptops> laptops;
//
//	public int getUid() {
//		return uid;
//	}
//
//	public void setUid(int uid) {
//		this.uid = uid;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEduaction() {
//		return eduaction;
//	}
//
//	public void setEduaction(String eduaction) {
//		this.eduaction = eduaction;
//	}
//
//	public List<Laptops> getLaptops() {
//		return laptops;
//	}
//
//	public void setLaptops(List<Laptops> laptops) {
//		this.laptops = laptops;
//	}
//	
//	
//	
//	
//	
//}
