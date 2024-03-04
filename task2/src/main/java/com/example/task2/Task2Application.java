package com.example.task2;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.task2.entity.User;
import com.example.task2.service.UserService;

@SpringBootApplication
public class Task2Application {
	
	public static void main(String[] args) {
		// SpringApplication.run(Task2Application.class, args);
		ApplicationContext context = SpringApplication.run(Task2Application.class, args);
		UserService userService = context.getBean(UserService.class);
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\nEnter email: ");
			String email = scanner.next();
			System.out.println("Enter username: ");
			String username = scanner.next();
			System.out.println("Enter password: ");
			String password = scanner.next();
			User user = new User(email, username, password);
			userService.saveUser(user);

			System.out.println("\n Created new user with credentials: \n email: "+email +
			"\n username: "+username +"\n password: "+ password+"\n");
			System.out.println("Number of users: "+userService.findNumberOfUsers() +"\n");
			System.out.println("Add another user: ");

		}
	}


}
