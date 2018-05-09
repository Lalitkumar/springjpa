/**
 * 
 */
package com.springjpa.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.config.AppConfig;
import com.springjpa.db.model.User;
import com.springjpa.db.model.UserList;
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
	
	@Autowired
	AppConfig config;
	
	
	@GetMapping("/getConfig")
	public String getConfig(){
		
		System.out.println("Toooo :" +config.getTo());
		System.out.println("From :" +config.getFrom());
		System.out.println();
		return "Hello";
	}
	
	@GetMapping("/getUsers")
	public List<User> getUserList(){
		return userRepository.findAll();
	}
	
	@GetMapping("/getUserByfName/{fName}")
	public User getUserByfName(@PathVariable String fName) {
		return userRepository.findByfName(fName);
	}
	
	@GetMapping("/getUserByCity/{city}")
	public List<User> getUsers(@PathVariable String city){
		return userRepository.findByCity(city);
	}
	
	@PostMapping("/addUsers")
	public List<User> addUser(@RequestBody UserList userList){
		//userRepository.save(user);
		
		for (User user : userList.getUserList()) {
			userRepository.save(user);
		}
		
		System.out.println("Add user");
		return userRepository.findAll();
	}
	
	@PutMapping("/updateUser/{uid}")
	public List<User> updateUser(@PathVariable int uid, @RequestBody User user){
		User obj = userRepository.findOne(uid);
		if(obj !=null) {
			obj.setfName(user.getfName());
			obj.setlName(user.getlName());
			obj.setCity(user.getCity());
			obj.setGender(user.getGender());
			
			userRepository.save(obj);
		}
		
		
		return userRepository.findAll();
	}
	
	

}
