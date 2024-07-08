package dk.friisjakobsen.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@GetMapping("/encrypt")
	public String encryptPassword() {
		return "encrypt";
	}
}