// to demo to create a thread by implemeent a runnable interface
package org.tnsif.multithreading;

public class MyRunnableThread implements Runnable {
	
	public  void run() {
		System.out.println(" Thread is in runnig state");
		
		
	}

	public static void main(String[] args) {

		MyRunnableThread t = new MyRunnableThread();
		t.run();
		
		
		
	}

}
