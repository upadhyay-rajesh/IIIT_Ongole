package com.corejava;

//if a class is having abstract method i.e. method without body then class also will be abstract(incomplete)
//we can not create object of an abstract class
//if we want to restrict other classes to create object of my class then we have 2 approach
   //a. make your class abstract
   //b. create private constructor

public abstract class Abstract_class_demo {

	void add() {
		System.out.println("add");
	}
	void sub() {
		System.out.println("add");
	}
	abstract void mult();
}
//if class is abstract then how to use that class function which are having body like add and sub function in above example
//via child class

class AbstractChild extends Abstract_class_demo{
	void mult() {
		System.out.println("mult");
		super.add();
	}
	public static void main(String arg[]) {
		//if we have parent child relationship then child class object we can store inside parant class reference as below
		Abstract_class_demo a=new AbstractChild();
		a.mult();
	}
}
















