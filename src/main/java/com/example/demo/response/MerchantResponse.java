package com.example.demo.response;

import com.example.demo.model.Merchant;

public class MerchantResponse {
	String status;
	 String message;
	 String stage;
	 
	 private Merchant merchant;

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

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	@Override
	public String toString() {
		return "MerchantResponse [status=" + status + ", message=" + message + ", stage=" + stage + ", merchant="
				+ merchant + "]";
	}
	 
	 
}
