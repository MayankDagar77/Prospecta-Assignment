package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EntryException;
import com.masai.model.Entry;
import com.masai.service.EntryService;

@RestController
public class EntryController {

	@Autowired
	private EntryService eService;
	
	@GetMapping("/entries")
	public ResponseEntity<List<Entry>> getAllEntriesHandler(@RequestParam("title") String title,@RequestParam("desc")String description,@RequestParam("auth") String auth,@RequestParam("https") Boolean https,@RequestParam("cors") String cors,@RequestParam("category") String category) throws EntryException{
		
		List<Entry> allEntries = eService.getAllEntries(title, description, auth, https, cors, category);
		
		return new ResponseEntity<List<Entry>>(allEntries,HttpStatus.OK);
	}
	
	@GetMapping("/random")
    public ResponseEntity<Entry> getRandomEntryHandler(@RequestParam("title") String title,@RequestParam("desc")String description,@RequestParam("auth") String auth,@RequestParam("https") Boolean https,@RequestParam("cors") String cors,@RequestParam("category") String category) throws EntryException{
		
	   Entry entry = eService.getRandomEntry(title, description, auth, https, cors, category);
	  
	   return new ResponseEntity<Entry>(entry,HttpStatus.OK);
	}
	
	@PostMapping("/entries")
	public ResponseEntity<Entry> createEntryHandler(@RequestBody Entry entry){
		
		Entry en = eService.createEntry(entry);
		
		return new ResponseEntity<Entry>(en,HttpStatus.CREATED);
	}
	
}
