//package com.bean;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//@Entity
//@Table(name="laptops")
//public class Laptops {
//	@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
//	private int lid;
//	private String brand;
//	private String model;
//	@ManyToOne
//	private Users user;
//	public int getLid() {
//		return lid;
//	}
//	public void setLid(int lid) {
//		this.lid = lid;
//	}
//	public String getBrand() {
//		return brand;
//	}
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//	public String getModel() {
//		return model;
//	}
//	public void setModel(String model) {
//		this.model = model;
//	}
//	public Users getUser() {
//		return user;
//	}
//	public void setUser(Users user) {
//		this.user = user;
//	}
//	
//	
//	
//
//}
