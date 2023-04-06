package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Entry {
	
	private String title;
	private String description;
	private String auth;
	private boolean https;
	private String cors;
	private String category;

}
