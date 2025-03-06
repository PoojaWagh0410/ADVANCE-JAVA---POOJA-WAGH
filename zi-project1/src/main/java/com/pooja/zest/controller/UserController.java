package com.pooja.zest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pooja.zest.entity.User;
import com.pooja.zest.mapper.UserMapper;
import com.pooja.zest.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path = "/home")
	protected String getHome() {
		return "Hello";
	}

	@PostMapping
	public ResponseEntity<Object> registerUser(@RequestBody User user) {
		User newUser = userService.registerUser(user);
		if (newUser != null)
			return new ResponseEntity<>(newUser, HttpStatus.CREATED);
		else
			return new ResponseEntity<>("User not registered", HttpStatus.BAD_REQUEST);
	}

	@PostMapping(path = "/login")
	public ResponseEntity<Object> loginUser(@RequestBody UserMapper userMapper) {
		User user = userService.userLogin(userMapper);
		if (user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Invalid Credentials", HttpStatus.UNAUTHORIZED);
		}
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Optional<User>> findUserById(@PathVariable int id) {
		Optional<User> user = userService.findUserById(id);
		if (user.isPresent()) {
			return new ResponseEntity<Optional<User>>(user, HttpStatus.FOUND);
		} else
			return new ResponseEntity<Optional<User>>(HttpStatus.NOT_FOUND);
	}

	@GetMapping(path = "/all")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping(path = "/email")
	public ResponseEntity<User> getUserByEmail(@RequestParam String email) {
		User user = userService.getUserByEmail(email);
		if (user != null) {
			return new ResponseEntity<User>(user, HttpStatus.FOUND);
		} else
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	}

	@GetMapping(path="/csrf-token")
	public CsrfToken csrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}

}
