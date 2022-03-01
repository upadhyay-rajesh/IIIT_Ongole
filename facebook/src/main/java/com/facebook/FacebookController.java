package com.facebook;

import java.util.Scanner;

public class FacebookController {
	void createProfile() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name");
		String name=sc.next();
		
		System.out.println("enter your Password");
		String password=sc.next();
		
		System.out.println("enter your Email");
		String email=sc.next();
		
		System.out.println("enter your Address");
		String address=sc.next();
		
		System.out.println("profile created");
	}
	
	void viewProfile() {
		System.out.println("profile viewed");
	}
	
	void deleteProfile() {
		System.out.println("profile deleted");
	}

}
