package com.PVR.bookingSystem.users.repository;

import com.PVR.bookingSystem.users.dto.UserDTO;

public class UserRepository {
	public UserDTO[] getAllUsers() {
		//get 5 Users from the memory
		
		int index = 0;
		UserDTO users[] = new UserDTO[5];  //Array of Objects
		
		UserDTO userDTO = new UserDTO("abc@gmail.com", "1111");
		userDTO.setName("abc");
		userDTO.setPhone("1111");
		users[index] = userDTO;
		index++;
		
		userDTO = new UserDTO("def@gmail.com", "2222");
		userDTO.setName("def");
		userDTO.setPhone("2222");
		users[index] = userDTO;
		index++;
		
		userDTO = new UserDTO("pqr@gmail.com", "3333");
		userDTO.setName("pqr");
		userDTO.setPhone("3333");
		users[index] = userDTO;
		index++;
		
		userDTO = new UserDTO("xyz@gmail.com", "4444");
		userDTO.setName("xyz");
		userDTO.setPhone("4444");
		users[index] = userDTO;
		index++;
		
		userDTO = new UserDTO("ijk@gmail.com", "5555");
		userDTO.setName("ijk");
		userDTO.setPhone("5555");
		users[index] = userDTO;
		index++;
		
		return users;
	}
}
