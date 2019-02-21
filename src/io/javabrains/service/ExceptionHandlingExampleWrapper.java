package io.javabrains.service;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		int[] listOfNumners= {10,20,30,40,0};
		int key =0;
		
		process(listOfNumners, key, (i,j) -> {
			try
			{
				System.out.println(i/j);
			}	
			catch (ArithmeticException e) {
				e.printStackTrace();
			}
		});
		
	}

	private static void process(int[] listOfNumners, int key, BiConsumer<Integer, Integer> biconsumer) {
		for(int i:listOfNumners)
			biconsumer.accept(i, key);
		
	}

}
