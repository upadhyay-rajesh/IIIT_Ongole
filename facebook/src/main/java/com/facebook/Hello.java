package com.facebook;

import java.util.Scanner;

public class Hello {
	//global variable
	int i;       //instance variable
	static int k;  //class variable

	public static void main(String[] args) {
		
		int j=9; //local variable
		
		float f=2.3f;
		
		System.out.println(f);
		
		System.out.println(j);
		
		//NS---->S    via Object
		Hello a=new Hello();
		
		System.out.println(a.i);
		
		//S-----> NS or S  direct
		System.out.println(k);
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter first no");
		int i1=s.nextInt();
		
		System.out.println("enter second no");
		int i2=s.nextInt();
		
		System.out.println("Addition is "+(i1+i2));

	}

}
