package com.corejava;

public class Method_Overloading_Demo {
	
	public int add(int i,int j)
	{
		return i+j;
	}
	
	public double add(float i,float j)
	{
		return (i+j); 
	}
	
	//if a class having two methods with same name but different parameter is known as method overloading
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading_Demo a=new Method_Overloading_Demo();
		int i=a.add(3, 4);
		double j=a.add(2.3f, 3.4f);
		System.out.println(i+"   "+j);
		
		ChildClass cc=new ChildClass();
		int p=cc.add(2, 3);
		System.out.println("result is "+p);

	}

}

class ChildClass extends Method_Overloading_Demo{
	public int add(int i,int j)
	{
		i=i*6;
		j=j*7;
		return i+j;
	}
}

















