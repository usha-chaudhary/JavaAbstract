package com.kist.abstractDemo;

public class Abstractionmain {
	public static void main(String[] args){
		Employee ad=new Programmer();
		ad.setId(12);
		ad.setName("Usha");
		ad.setLevel("Bachelor");
		ad.salary();
		ad.department();
		ad.tax();
		System.out.println(ad);
		
		Employee emp=new InternshipStudent();
		emp.setId(1);
		emp.setName("Camino");
		emp.setLevel("+2");
		emp.salary();
		emp.department();
		emp.tax();
		System.out.println(emp);
	}
	

}
