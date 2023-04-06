package com.masai.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Entry;

@Repository
public interface EntryRepo extends JpaRepository<Entry, String>{
	
	

}
