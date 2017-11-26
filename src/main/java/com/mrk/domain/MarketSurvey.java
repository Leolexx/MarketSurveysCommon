package com.mrk.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

/**
 * Market Survey
 * @author lev
 *
 */
@Getter @Setter
@Document
public class MarketSurvey {
	
	public MarketSurvey() {
		super();
		
	}
	
	public MarketSurvey(Integer id, String subject, String gender, 
			String country, Integer age, String currency, Integer income,
			String anyData) {
		super();
		this.id = id;
		this.subject = subject;
		this.gender = gender;
		this.country = country;
		this.age = age;
		this.currency = currency;
		this.income = income;
		this.anyData = anyData;
	}

	// Id 
	@Id
	private Integer id;

	// Subject
	@Indexed 
	private String subject;

	// Gender
	@Indexed 
	private String gender;
	
	// Age
	@Indexed 
	private Integer age;
	
	// Currency
	@Indexed 
	private String currency;

	// Country
	@Indexed 
	private String country;

	// Income
	@Indexed 
	private Integer income;
	
	// Any additional data
	private String anyData;
	
}
