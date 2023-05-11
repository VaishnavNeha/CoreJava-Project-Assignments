package com.neha.day1;

public class Question3a {
	
	public static void main(String[] args) {
		
		Chaining obj = new Chaining(5);
		System.out.println(obj.meth1().meth2().meth3().meth4());
		
	}

}


 class Chaining {
	 
	 int a;
	 
	 public Chaining(int a) {
		super();
		this.a = a;
	}

	public Chaining meth1() {
		 return this;
	 }
	 
	 public Chaining meth2() {
		 return this;
	 }
	 
	 public Chaining meth3() {
		 return this;
	 }
	 
	 public Chaining meth4() {
		 return this;
	 }

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Chaining [a=" + a + "]";
	}

	

	
}