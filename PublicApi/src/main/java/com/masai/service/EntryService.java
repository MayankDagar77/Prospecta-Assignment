package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.model.Entry;

@Service
public interface EntryService {
	
	public Entry createEntry(Entry entry);

	public List<Entry> getAllEntries(String title,String description,String auth,Boolean https,String cors,String category);
	
	public Entry getRandomEntry(String title,String description,String auth,Boolean https,String cors,String category);
	
}
