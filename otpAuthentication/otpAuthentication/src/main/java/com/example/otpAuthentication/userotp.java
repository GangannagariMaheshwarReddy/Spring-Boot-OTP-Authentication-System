package com.example.otpAuthentication;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class userotp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String otp;
	@Column
	int userid;
	@Column(name = "created_at")
	LocalDateTime createdAt;
	
	public userotp() {
		
	}

	public userotp(int id, String otp, int userid, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.otp = otp;
		this.userid = userid;
		this.createdAt = createdAt;
	}

	public userotp(String otp, int userid, LocalDateTime createdAt) {
		super();
		this.otp = otp;
		this.userid = userid;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	

}