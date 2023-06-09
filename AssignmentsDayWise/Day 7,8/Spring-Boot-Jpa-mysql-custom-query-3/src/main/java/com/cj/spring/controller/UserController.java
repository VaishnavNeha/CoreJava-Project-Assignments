																																																																															package com.cj.spring.controller;




import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.cj.spring.bean.User;
import com.cj.spring.service.UserService;

@RestController
@RequestMapping(value={"/user"})
public class UserController {
	@Autowired
	UserService userService;
	
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {
        System.out.println("Fetching User with id " + id);
        userService.getUser();
        User user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getUserByEmail(@PathVariable("email") String email) {
        System.out.println("Fetching User with email " + email);
        userService.getUser();
        List<User> u = userService.findByEmail(email);
        if (u == null) {
            return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<User>>(u, HttpStatus.OK);
    }
    
	 @PostMapping(value="/create",headers="Accept=application/json")
	 public ResponseEntity<Void> createUser(@Valid @RequestBody User user, UriComponentsBuilder ucBuilder){
	     System.out.println("Creating User "+user.getName());
	     userService.createUser(user);
	     HttpHeaders headers = new HttpHeaders();
	     headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
	     return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	 }

	 @GetMapping(value="/get", headers="Accept=application/json")
	 public List<User> getAllUser() {	 
	  List<User> tasks=userService.getUser();
	  return tasks;
	
	 }
	 
	 @GetMapping(value="/getnamecountry/{name}/{country}", headers="Accept=application/json")
	 public List<User> getByNameAndCountry(@PathVariable String name, @PathVariable String country) {	 
	  List<User> tasks=userService.findByNameAndCountry(name, country);
	  return tasks;
	
	 }

	@PutMapping(value="/update", headers="Accept=application/json")
	public ResponseEntity<String> updateUser(@RequestBody User currentUser)
	{
		System.out.println("sd");
	User user = userService.findById(currentUser.getId());
	if (user==null) {
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}
	userService.update(currentUser, currentUser.getId());
	return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{id}", headers ="Accept=application/json")
	public ResponseEntity<User> deleteUser(@PathVariable("id") long id){
		User user = userService.findById(id);
		if (user == null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		userService.deleteUserById(id);
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}
	
	@PatchMapping(value="/{id}", headers="Accept=application/json")
	public ResponseEntity<User> updateUserPartially(@PathVariable("id") long id, @RequestBody User currentUser){
		User user = userService.findById(id);
		if(user ==null){
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		User usr =	userService.updatePartially(currentUser, id);
		return new ResponseEntity<User>(usr, HttpStatus.OK);
	}
}
