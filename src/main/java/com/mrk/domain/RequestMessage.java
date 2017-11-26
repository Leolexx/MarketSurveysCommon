package com.mrk.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Request Message with filter criteria
 * @author Leo
 * @version 1.0
 *
 */
@Getter @Setter
public class RequestMessage {

	@Getter @Setter
	public static class Requester {
		// Id
		private String id;
		// Name
		private String name;
	}
	
	@Getter @Setter
	public static class Provider {
		// Id
		private String id;
		// Name
		private String name;
	}

	@Getter @Setter
	public static class Survey {
		@Getter @Setter
		public static class Target {
			// gender 
			private String gender;
			// age
			private List<Integer> age;

			@Getter @Setter
			public static class Income {
				// Currency
				private String currency;
				// Range of currency
				private List<Integer> range;
			}
			
			// Income
			private Income income;
		}

		// subject
		private String subject;
		// target group
		private Target target;
		// country
		private String country;
	}

	@Getter @Setter
	public static class Subscription {
		// way of delivery
		private List<String> channel;
		// frequency 
		private String frequency;
		// endpoint (for http delivery)
		private String endPoint;
		// clear all previous subscriptions 
		private Boolean isClearPrev;
	}

	// requster of survey 
	private Requester requester;
	// provider of survey
	private Provider provider;
	// survey structure
	private Survey survey;
	// subscription structure
	private Subscription subscription;
	
	
}
