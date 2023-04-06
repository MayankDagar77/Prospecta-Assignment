package com.masai.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Category {
	
	private String science;
	private String math;
	private String english;
	private String economics;
	

}
