package com.kist.abstractDemo;

public class InternshipStudent extends Employee{

	@Override
	public void salary() {
		System.out.println("$ 500");
		
	}

	@Override
	public void department() {
		System.out.println("Designing");
		
	}

	@Override
	public void tax() {
		System.out.println("0.1%");
		
	}
	
	public void workingdetail(){
		System.out.println("file");
	}

}
