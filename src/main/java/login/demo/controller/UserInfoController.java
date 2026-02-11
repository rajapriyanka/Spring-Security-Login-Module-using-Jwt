package login.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
@RestController
public class UserInfoController {
	@GetMapping("/user")
	public String getUsernameFromToken() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(authentication!=null) {
			return "Username from jwt:"+ authentication.getName();
			
		}else {
			return "No authentication user found ";
		}
		
		
	}
	

}
