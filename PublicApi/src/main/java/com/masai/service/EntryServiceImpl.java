package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EntryException;
import com.masai.model.Entry;
import com.masai.repo.EntryRepo;

@Service
public class EntryServiceImpl implements EntryService{
	
	@Autowired
	private EntryRepo eRepo;
	
	@Override
	public List<Entry> getAllEntries(String title, String description, String auth, Boolean https, String cors,
			String category) throws EntryException {
		
		List<Entry> resultList = new ArrayList<>();
		
		List<Entry> allEntries = eRepo.findAll();
		
	  if(allEntries.size()==0) {
			throw new EntryException("No entry found in database");
	  }
	  else {
		for(int i=0;i<allEntries.size();i++) {
		  Entry en = allEntries.get(i);
		  if(en.getTitle().contains(title) && en.getDescription().contains(description) && en.getAuth().equals(auth) && en.isHttps()==https && en.getCors().equals(cors) && en.getCategory().equals(category)) {
			 resultList.add(en);
		  }
		}
		
		return resultList;
	  }
	  
	}

	@Override
	public Entry getRandomEntry(String title, String description, String auth, Boolean https, String cors,
			String category) throws EntryException{
		
        Entry entry = null;
		
		List<Entry> allEntries = eRepo.findAll();
		
	  if(allEntries.size()==0) {
			throw new EntryException("No entry found in database");
	  }
	  else {
		
		for(int i=0;i<allEntries.size();i++) {
		  Entry en = allEntries.get(i);
		  if(en.getTitle().contains(title) && en.getDescription().contains(description) && en.getAuth().equals(auth) && en.isHttps()==https && en.getCors().equals(cors) && en.getCategory().equals(category)) {
			 entry=en;
		  }
		}
		
		return entry;
	  }
	}

	@Override
	public Entry createEntry(Entry entry) {
		
		return eRepo.save(entry);
	}
	
}
