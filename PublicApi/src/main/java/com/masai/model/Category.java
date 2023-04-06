package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Category cid;
	private String science;
	private String math;
	private String english;
	private String economics;
	

}
