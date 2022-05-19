package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoLibraryApplication.class,
				args);
		int i;
		Scanner in=new Scanner(System.in);
		i=in.nextInt();
		System.out.println(i);
	}

}
