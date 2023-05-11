package com.neha.day2;

public class Question2 {

	    public static void main(String[] args)
	    {
	        // Object of generic class Area with parameter Type
	        // as Integer
	        Area<Integer> rectangle = new Area<Integer>();
	        // Object of generic class Area with parameter Type
	        // as Double
	        Area<Double> circle = new Area<Double>();
	        rectangle.add(10);
	        circle.add(2.5);
	        System.out.println(rectangle.get());
	        System.out.println(circle.get());
	    }
}


class Area<T> {
	  
    // T is the Datatype like String,
    // Integer of which Parameter type,
    // the class Area is of
    private T t;
  
    public void add(T t)
    {
        // this.t specify the t variable inside
        // the Area Class whereas the right hand
        // side t simply specify the value as the
        // parameter of the function add()
        this.t = t;
    }
  
    public T get() { return t; }
  
    public void getArea() {}
    
}
