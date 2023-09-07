package com.me.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.dao.CookRepository;
import com.me.entity.Cook;
import com.me.exception.CookNotFoundException;

@Service
public class CookServiceImpl implements CookService {

	@Autowired
	private CookRepository cookRepo;
	
	@Override
	public Cook registerCook(Cook cook) {
		return cookRepo.save(cook);
	}

	
	

	@Override
	public Cook deleteCook(int id)  throws CookNotFoundException  {
		Optional<Cook> cook = cookRepo.findById(id);
		
		Cook emp = null;
		if(cook.isPresent()) {
			 emp = cook.get();
			cookRepo.deleteById(id);
			
		}else {
			throw new CookNotFoundException("No such cook");
		}
		return emp;
	}

	@Override
	public Cook getCook(int id)  throws CookNotFoundException {
		Optional<Cook> cook = cookRepo.findById(id);
		Cook emp = null;
		if(cook.isPresent()) {
			emp = cook.get();
		}else {
			throw new CookNotFoundException("No such cook");
		}
		return emp;
	}

	@Override
	public List<Cook> getCook() {
		return cookRepo.findAll();
	}




	@Override
	public Cook updateCook( Cook cook) {
		return cookRepo.save(cook);
	}




	




	
}