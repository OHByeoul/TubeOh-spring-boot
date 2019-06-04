package com.stream.tubeoh.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stream.tubeoh.dto.User;

@Service
public class LoginService {
	private static final Logger logger = LoggerFactory.getLogger(LoginService.class);
	
	@Autowired
	LoginRepository userRepository;
	
	public boolean checkLoginInfo(String id, String pw) {
		User getUser = userRepository.findById(id).orElse(new User());
		if(getUser.getId().equals(id) && getUser.getPassword().equals(pw)) {
			logger.info("로그인 인증 성공");
			return true; 
		}
		logger.info("로그인 인증 실패");
		return false;
	}
	
}
