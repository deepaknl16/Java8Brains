package io.javabrains.service;

public class Greeter {

	
	public void greet(Greeting greeting){
		greeting.perform();
		
	}
	public static void main(String[] args) {

		Greeter greeter= new Greeter();
		
		Greeting helloWorldGreeting= new HelloWorldGreeting();
		Greeting lamdagreeting = () -> System.out.println("Hello World Greeting Lamda");

		greeter.greet(lamdagreeting);
		greeter.greet(helloWorldGreeting);
		greeter.greet(() -> System.out.println("THis is inline lamda declaration"));
		
		MyLamda myLamdaFunction= () -> System.out.println("Hello World Lamda");
		MyAdd addFunction= (int a,int b) -> a+b ;
		
		
		
		
		
		//inline class
		Greeting innerClassGreeter = new Greeting(){
			public void perform() {
				System.out.println("Inner Class Greeting");
			}			
		};
		greeter.greet(innerClassGreeter);
		
	}



 interface MyLamda {
	void foo();
 }

 interface MyAdd{
	int add (int x,int y);
 }
}