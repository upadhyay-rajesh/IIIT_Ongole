package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controller.WhatsappController;
import com.whatsapp.controller.WhatsappControllerInterface;

public class WhatsappView {

	public static void main(String[] args) {
		String s="y";
		while(s.contentEquals("y")) {
		System.out.println("*********************MAIN MENU**************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");

		System.out.println("enter your choice");
		Scanner sc = new Scanner(System.in);

		int ch = sc.nextInt();

		WhatsappControllerInterface wc = new WhatsappController();

		switch (ch) {
		case 1:
			wc.createProfileController();
			break;
		case 2:
			wc.viewProfileController();
			break;
		default:
			System.out.println("wrong choice");
		}
		System.out.println("do you want to continue press y/n");
		s=sc.next();
		}

	}

}