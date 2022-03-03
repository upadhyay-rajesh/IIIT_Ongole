package com.facebook.controller;

import java.util.Scanner;

import com.facebook.entity.FacebookUser;

public class FacebookController {
	 public void createProfile() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name");
		String name=sc.next();
		
		System.out.println("enter your Password");
		String password=sc.next();
		
		System.out.println("enter your Email");
		String email=sc.next();
		
		System.out.println("enter your Address");
		String address=sc.next();
		
		//above information controller layer want to transfer to service layer so how to transfer?
		//using object controller will transfer
		//object of which class
		//object of entity class
		//why to transfer data using object only? ans: because of DTO(DATA TRANSFER OBJECT) design pattern
		
		FacebookUser fb=new FacebookUser();
		fb.setName(name);
		fb.setPassword(password);
		fb.setEmail(email);
		fb.setAddress(address);
		
		
		
		System.out.println("profile created");
	}
	
	public void viewProfile() {
		System.out.println("profile viewed");
	}
	
	public void deleteProfile() {
		System.out.println("profile deleted");
	}
	
	public void loginProfile() {
		System.out.println("profile viewed");
	}
	
	public void viewAllProfile() {
		System.out.println("profile deleted");
	}
	public void editProfile() {
		System.out.println("profile viewed");
	}
	
	public void searchProfile() {
		System.out.println("profile deleted");
	}

}
