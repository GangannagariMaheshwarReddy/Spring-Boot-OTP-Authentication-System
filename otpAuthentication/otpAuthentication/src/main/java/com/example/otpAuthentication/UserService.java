package com.example.otpAuthentication;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	userotprepo repository2;
	
	@Autowired
	MailSender mailSender;
	
	public Appuser registeruser(Appuser user) {
		return repository.save(user);
	}
	
	public boolean loginUser(String name, String password) {
		int otp;
		Appuser user = repository.findByName(name);
		if(user != null) {
			if(user.password.equals(password)) {
				
				userotp uotp = repository2.findByuserid(user.getId());
				if(uotp != null) {
					LocalDateTime createdTime = uotp.getCreatedAt();
					LocalDateTime currentTime = LocalDateTime.now();
					long difference = Duration.between(createdTime, currentTime).getSeconds();
					if(difference > 60) {
						repository2.delete(uotp);
						otp = new Random().nextInt(100000, 999999);
						userotp otpobj = new userotp(String.valueOf(otp), user.getId(), LocalDateTime.now());
						repository2.save(otpobj);
					} else {
						otp = Integer.parseInt(uotp.getOtp());
						
					}
				} else {
					 
					otp = new Random().nextInt(100000, 999999);
					userotp otpobj = new userotp(String.valueOf(otp), user.getId(), LocalDateTime.now());
					repository2.save(otpobj);
					}
				SimpleMailMessage message = new SimpleMailMessage();
				message.setTo(user.getEmail());
				message.setSubject("OTP CODE");
				message.setText("Your OTP CODE IS: " + otp);
				mailSender.send(message);
				return true;
				}
				return false;
			}
			return false;
		}
	
	public boolean verifyOtp(String otp) {
		userotp otpObj = repository2.findByOtp(otp);
		if(otpObj != null) {
			Appuser user = repository.findById(otpObj.getUserid()) .orElse(null);
			if(user != null) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
