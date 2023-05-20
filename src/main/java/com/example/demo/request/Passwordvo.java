package com.example.demo.request;

public class Passwordvo {
	
	private String mobile;
	private String passsword;
	 private String confirmpassword;
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Passwordvo [mobile=" + mobile + ", passsword=" + passsword + ", confirmpassword=" + confirmpassword
				+ "]";
	}

	
	

}
