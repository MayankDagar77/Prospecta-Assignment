package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.exception.CategoryException;
import com.masai.model.Category;

@Service
public interface CategoryService {

	public List<Category> getAllCategories() throws CategoryException;
	
	public String getHealthOfService();
	
}
