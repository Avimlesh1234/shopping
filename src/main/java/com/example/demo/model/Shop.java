package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Entity
public class Shop 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	Long age;
	String pan;
	String aadhar;
	String addressLine1;
	String addressLine2;
	String pincode;
	String State;
	String city;
	String mobilenumber;
	String mobilenumber2;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getMobilenumber2() {
		return mobilenumber2;
	}
	public void setMobilenumber2(String mobilenumber2) {
		this.mobilenumber2 = mobilenumber2;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", age=" + age + ", pan=" + pan + ", aadhar=" + aadhar
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", pincode=" + pincode
				+ ", State=" + State + ", city=" + city + ", mobilenumber=" + mobilenumber + ", mobilenumber2="
				+ mobilenumber2 + "]";
	}
	
	
	
	
	

}
