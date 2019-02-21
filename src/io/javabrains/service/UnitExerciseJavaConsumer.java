package io.javabrains.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.modal.Person;

public class UnitExerciseJavaConsumer {

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
			
		//Step 2 Print All
		performConditionallyPredicate(people, p -> true, p -> System.out.println(p));
		
		
		System.out.println("Print people with first name begine with T");
		performConditionallyPredicate(people, p -> p.getFirstName().startsWith("T"), p -> System.out.println(p));
	}


	private static void performConditionallyPredicate(List<Person> people, Predicate<Person> predicate,
							Consumer<Person> consumer) {
		
		for(Person person: people) {
			if(predicate.test(person))
					consumer.accept(person);
	
		}
	}
}

