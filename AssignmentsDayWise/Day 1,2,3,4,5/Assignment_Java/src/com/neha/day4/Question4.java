package com.neha.day4;

public class Question4 {

	public static void main(String[] args) {
		// creating an object of the class ABC  
		ABC obj1 = new ABC();  
		  
		// it will copy the reference, not value  
		ABC obj2 = obj1;  
		  
		// updating the value to 6   
		// using the reference variable obj2  
		obj2.x = 6;  
		  
		// printing the value of x using reference variable obj1   
		System.out.println("Shallow copy and The value of X is  " + obj1.x);  
		
		// creating an object of the class ABC  
		ABC ob1 = new ABC();  
		  
		// it will copy the reference, not value  
		ABC ob2 = new ABC();  
		  
		// updating the value to 6   
		// using the reference variable obj2  
		ob2.x = 6;  
		  
		// printing the value of x using reference variable obj1   
		System.out.println("Deep copy and The value of x is: " + ob1.x);  
		}  
	
	
	}



class ABC  
{  
// instance variable of the class ABC  
int x = 30;  
}  
