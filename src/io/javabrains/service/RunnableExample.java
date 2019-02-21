package io.javabrains.service;

public class RunnableExample {

	
	public static void main(String[] args) {
	
		Thread myThread= new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printable inside Runnable InnerClass");
			}
		});
		
		myThread.start();
		
		
		//Lamda Way
		Thread myThreadLamda =new Thread( () -> System.out.println("Inside runnable lamda"));
		myThreadLamda.start();
	}

}
