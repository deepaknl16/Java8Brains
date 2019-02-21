package io.javabrains.service;

public class TypeInteferenceExample {

	public static void main(String[] args) {
		StringLengthInterface stringLengthLamda= (String s) -> s.length();
		StringLengthInterface stringLengthLamdaOne=  s -> s.length()+1;
		
		System.out.println(stringLengthLamda.getLenght("Hello Lamda"));
		System.out.println(stringLengthLamdaOne.getLenght("Hello Lamda"));
		
		getLamdaLength(s -> s.length() - 1, "Hello Lamda");
	}

	public static void getLamdaLength(StringLengthInterface stringLengthLamda,String s) {
		System.out.println(stringLengthLamda.getLenght(s));
	}

 interface StringLengthInterface{
	int getLenght(String s);
 }
}
