package com.example.otpAuthentication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userotprepo extends JpaRepository<userotp,Integer> {
	userotp findByOtp(String otp);
	userotp findByuserid(int uid);
}
