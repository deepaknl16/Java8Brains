package io.javabrains.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import io.javabrains.modal.Person;

public class UnitExerciseJava8 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Caryle",51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

		
		//Step 1 Sort By Last Name
		System.out.println("Sort with last name ascending");
		Collections.sort(people, (p1,p2) ->  p1.getLastName().compareTo(p2.getLastName()));
			

		
		//Step 2  Print all elements in list
		System.out.println("Print ALl people");
		printConditionally(people, p -> true);
		
		
		//Step 3 Print all people beginning with C
		System.out.println("Print people with last name begine with C");
		printConditionally(people,  p -> p.getLastName().startsWith("C"));

		System.out.println("Print people with first name begine with C");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
		

		System.out.println("Print people with first name begine with T");
		printConditionallyPredicate(people, p -> p.getFirstName().startsWith("T"));
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		
		for(Person person: people) {
			if(condition.test(person))
					System.out.println(person);
	
		}
	}

	private static void printConditionallyPredicate(List<Person> people, Predicate<Person> predicate) {
		
		for(Person person: people) {
			if(predicate.test(person))
					System.out.println(person);
	
		}
	}
}

