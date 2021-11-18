package com.carrito;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class CarritoApplicationTests {
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void contextLoads() {

		String clave = encoder.encode("hola1234");
		String secret = encoder.encode("secret123");

		System.out.println(clave);
		System.out.println(secret);
	}
	
	

}
