package io.javabrains.service;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		int[] listOfNumners= {10,20,30,40,0};
		int key =1;
		
		process(listOfNumners, key,wrapperLamda ( (i,j) -> System.out.println(i/j)));
		
	}

	private static void process(int[] listOfNumners, int key, BiConsumer<Integer, Integer> biconsumer) {
		for(int i:listOfNumners)
			biconsumer.accept(i, key);
		
	}
	
	private static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> biconsumer)
	{
		return ( (v,k) -> System.out.println(v + k) );
	}

}
