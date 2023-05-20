package com.example.demo.response;

public class ProductResponse {
	
	private String status;
	 private String messsage;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	@Override
	public String toString() {
		return "ProductResponse [status=" + status + ", messsage=" + messsage + "]";
	}
	 

}
