package com.neha.day4;

public class Question3 {
	
    static String str="Hello this is my multithreading example..";
    static int cindex=0;
    
	public static void main(String[] args) throws InterruptedException {
	
        System.out.println("End of Main Thread...");
		PrintChar pc1= new PrintChar("Beta");
        Thread t1 = new Thread(pc1);

		t1.start();
		
		PrintChar pc2= new PrintChar("Gamma");
        Thread t2 = new Thread(pc1);

		t1.join();
		t2.join();
		System.out.println(t1.getState().name()+" | "+Thread.currentThread().getState().name());

	}

}

class PrintChar implements Runnable {
	
	PrintChar(String string) {}

	@Override
	public void run() {
		for(int i=0;i<Question3.str.length();i++) {
			System.out.println(Thread.currentThread().getName()+" Thread  .."+Question3.str.charAt(Question3.cindex++));
			try {
				Thread.sleep(60);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}