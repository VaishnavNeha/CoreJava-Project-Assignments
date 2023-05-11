package com.neha.day1;

public class Question1 {

	static int i=1;
	public static void main(String[] args) {
		System.out.println(i++);
		try {
			String[] s=null; main(s);
			} catch(StackOverflowError e) { 
				e.printStackTrace();
		  } 
		 

	}

}
