package com.jva;

public class ClassA1 {

	int i = 10;
	String s = "Java";
	String j=	i+s;
	public void method11() {
		System.out.println(j);
	}
	
	
	public void method1() {
		System.out.println("C#");
	}
	
	public void addNumbers() {
		int t = i + 10;
		System.out.println(t);
	}
	
	public void findOddEvenNumber() {
		
	}
	
	public void findPrimeNumber() {
		
	}
	
	
	static public void main(String[] abc) {
		ClassA1 obj = new ClassA1();

		obj.method1();
		obj.addNumbers();
		obj.method11();
		//new ClassA1().method1();   //Not a good Practice
		//new ClassA1().addNumbers();
	}
}
