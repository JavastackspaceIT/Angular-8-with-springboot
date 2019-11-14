package com.appointment.main.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.jws.soap.SOAPBinding.Use;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.main.form.User;

@RestController
@RequestMapping(value = "/student")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentRegisterationController {
	List<User> userList = new ArrayList<User>();

	@GetMapping(value = "/getdetails")
	public String getStudentDetails() {

		return "Hi , Welcome on this system.";
	}

	@PostMapping(value = "/register")
	public String register(@RequestBody User user) {
		System.out.println(user);
		return "Hi you have register successfully !";
	}

	@GetMapping(value = "/getAll")
	public List<User> getUsers() {

		userList.add(new User("rakesh", "rakesh@gmail.com", "4", "Insurance"));
		userList.add(new User("rakesh", "rakesh@gmail.com", "4", "Insurance"));
		userList.add(new User("rakesh", "rakesh@gmail.com", "4", "Insurance"));
		userList.add(new User("rakesh", "rakesh@gmail.com", "4", "Insurance"));
		userList.add(new User("rakesh", "rakesh@gmail.com", "4", "Insurance"));
		userList.add(new User("rakesh", "rakesh@gmail.com", "4", "Insurance"));
		System.out.println("userList  :" + userList);
		return userList;
	}

	@GetMapping(value = "/getEmailById")
	public List<User> getUsersByEmailId(@RequestParam(name = "email") String email) {
		List<User> filterUserByEmail = new ArrayList<>();
		for (User user : userList) {
			  if(user.getEmail().equals(email)) {
				  filterUserByEmail.add(user);
			  }
		}
		System.out.println("filterUserByEmail" +filterUserByEmail);
		return filterUserByEmail;
	}

	
	@PostConstruct
	void  feedUserDataOnLoad() {

		userList.add(new User("rakesh", "rakesh@gmail.com", "4", "Insurance"));
		userList.add(new User("rakesh", "rakesh@gmail.com", "4", "Insurance"));
		userList.add(new User("rakesh", "rakesh@gmail.com", "4", "Insurance"));
		userList.add(new User("rakesh", "rajesh@gmail.com", "4", "Insurance"));
		userList.add(new User("rakesh", "ramesh@gmail.com", "4", "Insurance"));
		userList.add(new User("rakesh", "umesh@gmail.com", "4", "Insurance"));
		
	}
}
