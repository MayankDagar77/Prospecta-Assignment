package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CategoryException;
import com.masai.model.Category;
import com.masai.repo.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepo cRepo;

	@Override
	public List<Category> getAllCategories() throws CategoryException {
		
	    List<Category> allCategories = cRepo.findAll();
	    
	    if(allCategories.size()==0) {
	      throw new CategoryException("Category list is empty");
	    }
	    else {
	      return allCategories;
	    }
	    
	}

	@Override
	public String getHealthOfService() {
		return "OK";
	}
	
	
	
}
