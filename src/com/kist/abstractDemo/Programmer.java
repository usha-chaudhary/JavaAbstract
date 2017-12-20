package com.kist.abstractDemo;

public class Programmer extends Employee {

	@Override
	public void salary() {
		System.out.println("$ 10000");
	}

	@Override
	public void department() {
		System.out.println("Development");
		
	}

	@Override
	public void tax() {
	System.out.println("$1");
		
	}
	
	public void workingTime(){
		System.out.println("8 hours per day");
	}
	

}
