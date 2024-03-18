package com.PVR.bookingSystem.users.services;

import com.PVR.bookingSystem.users.dto.UserDTO;
import com.PVR.bookingSystem.users.repository.UserRepository;

public class UserService {
	
	//contains the logic for authentication
	public UserDTO auth(UserDTO user) {
		UserRepository userRepository = new UserRepository();
		UserDTO users[] = userRepository.getAllUsers();
		
		for(UserDTO userObject: users)
			if(userObject != null)
				if(userObject.getEmail().equals(user.getEmail()) && userObject.getPassword().equals(user.getPassword()))
					return userObject;
		
		return null;
	}
}
