package com.msfa.content;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.stereotype.Component;

@Component
public class ContentClass implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Thread.sleep(60000);
		System.out.println("deneme deneme deneme dendeme");
		Thread.sleep(3000);
		System.out.println("deneme deneme deneme dendeme new new ");
		
	}

	
	
}
