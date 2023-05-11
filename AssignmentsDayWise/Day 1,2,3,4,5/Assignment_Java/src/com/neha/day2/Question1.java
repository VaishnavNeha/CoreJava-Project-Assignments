package com.neha.day2;

public class Question1 {

	public static void main(String[] args) {
		
	
		//defining a String object  
		String s = "21,321,321;4324,3243,24;234,3212,3;242,13,21;123,2134,32";   
		//split string by multiple delimiters   
		String[] stringarray = s.split("[, ; ']+");   
		//iterate over string array  
		for(int i=0; i< stringarray.length; i++)  
		{  
		//prints the tokens  
		System.out.println(stringarray[i]);  
		}  
		}   
	
}
