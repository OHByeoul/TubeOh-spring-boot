package com.stream.tubeoh.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value= {"/user","/"})
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("login")
	public String mainPage(@RequestParam String id, @RequestParam String pw,Model model) {
		boolean result = loginService.checkLoginInfo(id,pw);
		model.addAttribute("result", result);
		return "main";
	}
}
