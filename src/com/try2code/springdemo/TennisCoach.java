package com.try2code.springdemo;

public class TennisCoach implements Coach {
	
	private String  emailAddress ;
	private String  teamName ;
	private FortuneService fortuneService ; 
	
	


	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


}
