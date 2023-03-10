package ENCWEB.ENC.controller;
import org.springframework.http.HttpStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

import ENCWEB.ENC.entity.user;
import ENCWEB.ENC.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService repository;
	
	@GetMapping("")
	public ResponseEntity<user> login(@RequestAttribute("matricule")Long matricule,@RequestAttribute("pwd")Long pwd){
		user obj=repository.findUserBymatricule(matricule);
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}

}
