package com.java.examples;


/*abstract class MyAbstract2 {
	public abstract void m3();
}*/


 abstract class MyAbstract   implements myinterface{

	//sMyAbstract a;
	String s ;
	
	
	public void m1(){
		System.out.println("hello");
	}
	
	public abstract void m2();
	
}

interface myinterface{
	String s = "dd";
	int i = 10;
	
}

class Sub1 extends MyAbstract{

	@Override
	public void m2() {
		s="Sub1";
		System.out.println(s);
	}
}

class Sub2 extends MyAbstract{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		s="Sub2";
		System.out.println(s);
	}
}

public class MyClient{
	public static void main(String args[]){
		Sub1 s1 = new Sub1();
		s1.m2();
		
		Sub2 s2 = new Sub2();
		s2.m2();
	  
	}
}

