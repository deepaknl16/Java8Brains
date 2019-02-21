package io.javabrains.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.javabrains.modal.Person;

public class UnitExerciseJava7 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Caryle",51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

		
		//Step 1 Sort By Last Name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		
		//Step 2  Print all elements in list
		System.out.println("Print ALl people");
		printAll(people);
		
		//Step 3 Print all people beginning with C
		System.out.println("Print people with last name begine with C");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});

		System.out.println("Print people with first name begine with C");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		
		for(Person person: people) {
			if(condition.test(person))
					System.out.println(person);
	
		}
	}

	private static void printAll(List<Person> people) {
		for(Person person: people)
		{
			System.out.println(person);
		}
	}

}


interface Condition{	
	public boolean test(Person p);
}