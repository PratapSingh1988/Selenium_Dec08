package com.jva;


public class ClassA4 {

	//Constructor
	/*
	 * Cunst - is a special method, which execute automatically when object is created
	 * 
	 * 1. Its name must be same as class name
	 * 2. It doesn't have any return type
	 */
	
	public ClassA4() {
		System.out.println("Java");
	}
	
	
	public ClassA4(int a) {
		System.out.println("Java----Parameter");
	}
	
	/*
	 * public ClassA4(int t) {
	 * 
	 * }
	 * 
	 * public ClassA4(String s) {
	 * 
	 * }
	 * 
	 * public ClassA4(int t, String s) {
	 * 
	 * }
	 */
	
	public void method1() {
		System.out.println("Noida");
		
		//Actions act = new Actions(arg0)
	}
	
	
	public static void main(String[] args) {
		ClassA4 obj = new ClassA4();
	
		ClassA4 obj1 = new ClassA4(10);
		
		
		
		obj.method1();
		//Actions act = new Actions
		
	}
}
