package com.neha.day1;

public class Question3b {

	public static void main(String[] args) {
		ChainingMethod1 obj1 = new ChainingMethod1(5);
		ChainingMethod2 obj2 = new ChainingMethod2(10);
		System.out.println(obj1.meth1().meth2()+"  : "+obj2.meth3().meth4());
		

	}

}



class ChainingMethod1 {
	 
	 int a;
	 
	 public ChainingMethod1(int a) {
		super();
		this.a = a;
	}

	public ChainingMethod1 meth1() {
		 return this;
	 }
	 
	 public ChainingMethod1 meth2() {
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
		return "ChainingMethod1 [a=" + a + "]";
	}
	
}

class ChainingMethod2 {
	 
	 int b;
	 
	 public ChainingMethod2(int b) {
		super();
		this.b = b;
	}
	 
	 public ChainingMethod2 meth3() {
		 return this;
	 }
	 
	 public ChainingMethod2 meth4() {
		 return this;
	 }

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ChainingMethod2 [b=" + b + "]";
	}
	 
	
	 
}
