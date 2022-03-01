package com.facebook;

import java.util.Scanner;

public class FacebookView {

	public static void main(String[] args) {
		
		String s="y";
		
		while(s.equals("y")) {
		
		Scanner sc = new Scanner(System.in);// why scanner ans - to take input from user

		System.out.println("*******************MAIN MENU***************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to edit profile");

		System.out.println("press 5 to search profile");

		System.out.println("press 6 to view All profile");
		System.out.println("press 7 to login profile");

		System.out.println("enter your choice");
		int ch = sc.nextInt();

		FacebookController a=new FacebookController(); //if a non static method like createProfile we want to call inside static so first we have to create object of class then we will call
											//because system will allocate memory for all static property but not allocate memory for non static properties

		
		switch (ch) {
		case 1: a.createProfile();
			break;
		case 2:
			a.viewProfile();
			break;
		case 3:
			a.deleteProfile();
			break;
		case 4:
			System.out.println("profile edited");
			break;
		case 5:
			System.out.println("profile searched");
			break;
		case 6:
			System.out.println("all profile viewed");
			break;
		case 7:
			System.out.println("login success");
			break;
		default:
			System.out.println("wrong choice");
		}
		System.out.println("do you want to continue press y/n");
		s=sc.next();
	}
	}
	
	
}


















