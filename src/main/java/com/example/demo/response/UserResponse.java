package com.example.demo.response;

import com.example.demo.model.User;

public class UserResponse {
	
	String status;
	 String message;
	 String stage;
	 private User user;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	@Override
	public String toString() {
		return "UserResponse [status=" + status + ", message=" + message + ", stage=" + stage + ", user=" + user + "]";
	}
	
	
	 

}
