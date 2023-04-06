package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CategoryException;
import com.masai.model.Category;
import com.masai.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService cService;
	
	@GetMapping("/categories")
	public ResponseEntity<List<Category>> getAllCategoriesHandler() throws CategoryException{
		
		List<Category> allCategories = cService.getAllCategories();
		
		return new ResponseEntity<List<Category>>(allCategories,HttpStatus.OK);
	}
	
	@GetMapping("/health")
	public ResponseEntity<String> getHealthOfServiceHandler(){
		String status = cService.getHealthOfService();
		
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}
	

}
