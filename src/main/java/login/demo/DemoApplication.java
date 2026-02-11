package login.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
//		String password = "myPassword123";
//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//
//		String hashedPassword = encoder.encode(password);
//
//		System.out.println("BCrypt hash of password: " + hashedPassword);
	}

}
