package com.jva;

public class MethodOverLoading {

	
	//construicter overloading
	
	public MethodOverLoading() {
		// TODO Auto-generated constructor stub
		
		System.out.println("First--Consturcter");
	}
	
	
public	MethodOverLoading(int s,int b){
		
	System.out.println("aurg--Consturcter");
	}
	//method overloading same name method but parameter is diffrent in method overloading
	
	
	public void method1()
	
	{
		System.out.println("method1");
		
	}
	
	
	public int method1(int s)
	
	{
		System.out.println(s);
		return s;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverLoading methodOverLoading=new MethodOverLoading();
		
		methodOverLoading.method1(4);
		methodOverLoading.method1();
		
	}

}
