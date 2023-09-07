package com.me.service;

import java.util.List;

import javax.validation.Valid;

import com.me.entity.Cook;
import com.me.exception.CookNotFoundException;

public interface CookService {
	public Cook registerCook(Cook cook);
	public Cook deleteCook(int id) ;
	public Cook getCook(int id) ;
	public List<Cook> getCook();
	public Cook updateCook(Cook cook);
}