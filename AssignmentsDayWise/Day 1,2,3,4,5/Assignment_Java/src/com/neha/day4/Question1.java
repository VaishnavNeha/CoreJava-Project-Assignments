package com.neha.day4;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Question1 {

		public static void main(String[] args)
		{	
		// Create a Queue. This priority queue stores Strings objects.  
		   PriorityQueue<String> pq = new PriorityQueue<>((c1,c2)->c1.length()-c2.length());
		   
		// Adds elements to the priority queue.
		   pq.offer("USA");
		   pq.offer("India");
		   pq.offer("England");
		   pq.offer("Englann");
		   pq.offer("Singapore");

		System.out.println("Priority queue: " +pq);
		String str = pq.poll(); //peek()
		System.out.println(str);
		// Iterating elements of priority queue.
		   System.out.println("Iterating elements of priority queue");
		   Iterator<String> iterator = pq.iterator();
		   while (iterator.hasNext()) {
		    System.out.print(iterator.next() + " ");
		   }
		 
	}

}
