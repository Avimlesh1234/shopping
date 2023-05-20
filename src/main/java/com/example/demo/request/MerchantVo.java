package com.example.demo.request;

public class MerchantVo {
	String username;
	String role;

	String firstmobile;
	String secondmobile;
	
	String nomineename;
	String nomineenumber;
	String componyname;
	
	
	String otp;
	String email;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFirstmobile() {
		return firstmobile;
	}
	public void setFirstmobile(String firstmobile) {
		this.firstmobile = firstmobile;
	}
	public String getSecondmobile() {
		return secondmobile;
	}
	public void setSecondmobile(String secondmobile) {
		this.secondmobile = secondmobile;
	}
	public String getNomineename() {
		return nomineename;
	}
	public void setNomineename(String nomineename) {
		this.nomineename = nomineename;
	}
	public String getNomineenumber() {
		return nomineenumber;
	}
	public void setNomineenumber(String nomineenumber) {
		this.nomineenumber = nomineenumber;
	}
	public String getComponyname() {
		return componyname;
	}
	public void setComponyname(String componyname) {
		this.componyname = componyname;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MerchantVo [username=" + username + ", role=" + role + ", firstmobile=" + firstmobile
				+ ", secondmobile=" + secondmobile + ", nomineename=" + nomineename + ", nomineenumber=" + nomineenumber
				+ ", componyname=" + componyname + ", otp=" + otp + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
