/**
 * 
 */
package com.springjpa.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.db.model.User;
import com.springjpa.db.repository.UserRepository;

/**
 * @author Lalit
 *
 */

@RestController
@RequestMapping("/user")
public class SpringJpaController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/getUsers")
	public List<User> getUserList(){
		return userRepository.findAll();
	}
	
	@PostMapping("/addUsers")
	public List<User> addUser(@RequestBody List<User> userModel){
		//userRepository.save(user);
		
		User userObj = null;
		for (User user : userModel) {
			userObj.setfName(user.getfName());
			userObj.setlName(user.getlName());
			userObj.setGender(user.getGender());
			userObj.setCity(user.getCity());
			
			userRepository.save(user);
		}
		
		System.out.println("Add user");
		return userRepository.findAll();
	}
	
	//@PutMapping
	//public List<User> updateUser()
	
	

}
