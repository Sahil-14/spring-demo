package com.inteuron.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	//create a non-ag constructor
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public CricketCoach() {
		System.out.println("Inside no arg constructor");
	};
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}


	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bawling for";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
