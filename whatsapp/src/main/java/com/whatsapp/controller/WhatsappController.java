package com.whatsapp.controller;

import java.util.Scanner;

import com.whatsapp.entity.WhatsappUser;
import com.whatsapp.service.WhatsappService;
import com.whatsapp.service.WhatsappServiceInterface;

public class WhatsappController implements WhatsappControllerInterface {

	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter address");
		String address=sc.next();
		
		WhatsappUser wu=new WhatsappUser();
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);
		
		WhatsappServiceInterface ws=new WhatsappService();
		
		int i=ws.createProfileService(wu);
		
		if(i>0) {
			System.out.println("profile created");
		}
		else {
			System.out.println("could not create profile");
		}
		

	}

	public void viewProfileController() {
Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email which profile you want to see");
		String email=sc.next();
		
		WhatsappUser wu=new WhatsappUser();
		wu.setEmail(email);
		
		WhatsappServiceInterface ws=new WhatsappService();
		WhatsappUser u1=ws.viewProfileService(wu);
		
		if(u1!=null) {
			System.out.println("Name is "+u1.getName());
			System.out.println("Password is "+u1.getPassword());
			System.out.println("Email is "+u1.getEmail());
			System.out.println("Address is "+u1.getAddress());
		}
		else {
			System.out.println("profile not found");
		}
	}

}










