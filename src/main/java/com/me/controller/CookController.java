package com.me.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.me.entity.Cook;
import com.me.exception.CookNotFoundException;
import com.me.service.CookService;

@RestController

public class CookController {

	@Autowired
	private CookService cookService;
	
	@PostMapping(value = "/register")
	public Cook registerCook(@Valid @RequestBody Cook cook) {
		return cookService.registerCook(cook);
	}
	
	@PutMapping(value = "/update")
	public Cook updateCook(@RequestBody @Valid Cook cook) {
		return cookService.updateCook(cook);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public Cook deleteCook(@PathVariable int id)  {
		return cookService.deleteCook(id);
	}
	
	@GetMapping(value = "/get/{id}")
	public Cook getCook(@PathVariable int id){
		return cookService.getCook(id);
	}
	
	@GetMapping(value = "/getAll")
	public List<Cook> getCook() {
		return cookService.getCook();
	}
}