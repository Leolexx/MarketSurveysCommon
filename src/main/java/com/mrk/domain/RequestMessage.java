package com.mrk.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Request Message with filter criteria
 * @author Lev
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
			private String gender;
			private List<Integer> age;

			@Getter @Setter
			public static class Income {
				private String currency;
				private List<Integer> range;
			}
			
			private Income income;
		}

		private String subject;
		private Target target;
		private String country;
	}

	@Getter @Setter
	public static class Subscription {
		// way of delivery
		private List<String> channel;
		// frequency 
		private String frequency;
		// Endpoint (for http delivery)
		private String endPoint;
		// clear all previous subscriptions 
		private Boolean isClearPrev;
	}

	private Requester requester;
	private Provider provider;
	private Survey survey;
	private Subscription subscription;
	
	
}
