package com.corejava;

//C B A
//C
//ERROR
//A B C

class A{
	
	int i=7;
	void ss() {
		System.out.println("hello");
	}
	
	A(){
		super();
		System.out.println("A");
	}
}

class B extends A{
	B(){
		super();                    //here calling parent class constructor super with small bracket must be the first statement of constructor
		System.out.println("B");
		super.ss();                 //here calling parent class method
		System.out.println(super.i);//here calling parent class variable
	}
}

class C extends B{
	C(){
		super();
		System.out.println("C");
		
	}
}

public class Contructor_Chaining_Demo {

	public static void main(String[] args) {
		new C();

	}

}
