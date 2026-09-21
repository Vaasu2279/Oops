package com.oops;

import java.util.Scanner;

public class House_loan implements Loan {
	
	Scanner sc = new Scanner(System.in);
	private String name;
	
	@Override
	public String Name() {
		
		System.out.println("enter your name :");
		String name = sc.nextLine();
		this.name = name;
		return name;
	}

	@Override
	public boolean phone_number() {
		
		System.out.println("enter your mobile number :");
		String phone = sc.next();
		return phone.matches("[6-9]{1}[0-9]{9}");
		//if(!valid) {
		//	System.out.println("mobile number is invalid");
		//}
		//return valid;
	}
	
	@Override
	public double Salary() {
		
		System.out.println("enter your salary :");
		double salary = sc.nextDouble();
		if(salary<30000) {
			System.out.println("accordidng to our policy your loan is not granted ... Because your salary is too low ");
			System.out.println("our process is ended mr."+this.name);
			System.exit(0);
		}
		return salary;
	}

	@Override
	public int Age() {
		
		System.out.println("enter your age :");
		int age = sc.nextInt();
		if(age<18) {
			System.out.println("according to our policy your loan is not granted ...your age is ineligible for loan ");
			System.out.println("our process is ended mr."+this.name);
			System.exit(0);
		}
		return age;
	}

	@Override
	public boolean aadhar_number() {
		
		System.out.println("enter your aadhar number :");
		String aadhar = sc.next();
		return aadhar.matches("[0-9] {12}");
		
	}

	@Override
	public boolean pan_number() {
		
		System.out.println("enter your Pan_number :");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}
	
	@Override
	public double ROI() {
		
		int roi = 2;
		int cibil = Cibil();
		
		if(cibil <=1000 &&  cibil>=950){
			roi += 1;
			System.out.println("according to your cibil score your rate of interset is :"+roi);
		}
		
		else if(cibil <=951 && cibil >=750) {
			roi += 3;
			System.out.println("according to your cibil score your rate of interset is :"+roi);
		}
		
		else if(cibil <=751 && cibil >=550) {
			roi += 5;
			System.out.println("according to your cibil score your rate of interset is :"+roi);
		}
		
		else {
			roi +=8;
		}
		
		System.out.println("further process come to the office");
		System.out.println("thank you..........");
		return roi;
		
	}
	
	@Override
	public int Cibil() {
		
		System.out.println("enter your cibil score :");
		int cibil = sc.nextInt();
		return cibil;
	}

	public static void main(String[] args) {
		
		House_loan hl = new House_loan();
		
		System.out.println("");
		System.out.println("*****WELCOME TO VASU FINANCE***** ");
		System.out.println();
		
		hl.Name();
		hl.phone_number();
		hl.Age();
		hl.Salary();
		hl.aadhar_number();
		hl.pan_number();
		hl.ROI();
  
	}

}
