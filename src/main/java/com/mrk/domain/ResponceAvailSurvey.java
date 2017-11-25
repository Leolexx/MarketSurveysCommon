package com.mrk.domain;

import org.springframework.data.mongodb.core.index.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * Available surveys
 * @author lev
 *
 */
@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponceAvailSurvey {
	
	
	public ResponceAvailSurvey(String subject) {
		super();
		this.subject = subject;
	}

	// Subject
	@Indexed 
	private String subject;
	
}
