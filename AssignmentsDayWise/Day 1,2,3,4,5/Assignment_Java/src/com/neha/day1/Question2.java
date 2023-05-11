package com.neha.day1;


class A{
	
	int a[]= new int[100000000];
	int b[]= new int[100000000];
	int c[]= new int[100000000];
	int d[]= new int[100000000];
	
}

public class Question2 {

	public static void main(String[] args) {
		int i=0;
	//	System.out.println(i);


	try {
		for(i=0;i<100000000;i++)
		{
			A a= new A();
		//	System.out.println(i);

		}
		
	}catch(StackOverflowError e) {
		e.printStackTrace();
		//System.out.println(i+"error");
	}

	}

}
