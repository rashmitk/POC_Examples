package com.java.examples;

abstract class TheAbstract{
	void hello(){}
}


interface AA{
	public String a = "A";
	
	
	default void hello(){}
}

interface BB{
	public String b = "B";
//	public String a = "B";
	//default void hello(){}
}


public class InheritanceTest  implements AA, BB{
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
	}

}
