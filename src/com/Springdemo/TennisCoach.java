package com.Springdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach{
	
	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach(){
		System.out.println(">> TennisCoach: this is tennis coach constructor");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		super();
//		this.fortuneService = theFortuneService;
//	}

//	@Autowired
//	public void setFortuneService(FortuneService thefortuneService) {
//		System.out.println(">> Tennis Coach: Inside the setter injection");
//		this.fortuneService = thefortuneService;
//	}
//	
//	@Autowired
//	public void dosomecrazy(FortuneService thefortuneService) {
//		System.out.println(">> Tennis Coach: Inside the dosomecrazy injection");
//		this.fortuneService = thefortuneService;
//	}
//	
	
	@Override
	public String theTennisCoach() {
		// TODO Auto-generated method stub
		return "This is tennis coach method";
	}



	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
