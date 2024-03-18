package com.PVR.bookingSystem.users.views;

import java.util.*;

import com.PVR.bookingSystem.movies.views.MovieView;
import com.PVR.bookingSystem.users.dto.UserDTO;
import com.PVR.bookingSystem.users.services.UserService;

//Login Screen / Console I/O
public class LoginView {
	public static void main(String [] args) {
		LoginView loginView = new LoginView();
		loginView.input();
	}
	
	public void input() {
		//Take Input for UserId and Password
		Scanner sc = new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter your email: ");
		String email = sc.next();
		System.out.println("Enter password: ");
		String password = sc.next();
		
		//store input to DTO
		UserDTO userDTO = new UserDTO(); //ques: why didnt we passed the values while initializing only?
		userDTO.setEmail(email);
		userDTO.setPassword(password);
		
		//Calling a service
		UserService userService = new UserService();
		UserDTO userObject = userService.auth(userDTO);
		
		if(userObject == null)
			System.out.println("Invalid Email or Password!");
		else {
			System.out.println("Welcome " + userObject.getName());
			
			MovieView movieView = new MovieView();
			while(true) {
				movieView.showMovie();
				System.out.println("Press q for Exit and c for continue");
				String choice = sc.next();
				if(choice.equalsIgnoreCase("q")) {
					System.out.println("Bye Bye....");
					System.exit(0);
					//return;
				}
				else if(choice.equalsIgnoreCase("c"))
					continue;
			}
		}
		
		sc.close();
	}
}
