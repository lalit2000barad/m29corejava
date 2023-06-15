package org.tnsif.multithreading;

public class ThreadProgram extends Thread{

	public void run() {
		System.out.println(" thread is runnibg state");
	}
	
	
	
	public static void main(String[] args) {

	//ThreadProgram.start();
	ThreadProgram t = new ThreadProgram();
	t.start();
	/*   */
		
		
	}

}
