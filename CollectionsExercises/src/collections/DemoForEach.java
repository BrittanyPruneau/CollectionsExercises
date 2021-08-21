package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

public class DemoForEach
{

	public static void main(String[] args)
	{
		demoForEachWithListOfStrings();
		
		/*
		 * Here we will create a list and a set and print them. 
		 */
		
		List<Integer> numberList = new ArrayList<>();
		for(int i = 0; i< 15; i++)
		{
			int randomNumber = (int) Math.floor(Math.random() * 10);
			numberList.add(randomNumber);
		}
		System.out.println();
		System.out.print("NumberList: ");
		numberList.forEach(n -> System.out.print(n+ " "));
		
		List<Integer> numberlist2 = new ArrayList<>();
		numberList.forEach(n -> numberlist2.add(10*n));
		System.out.println();
		System.out.println("numberList2: " + numberlist2);
		
		/*
		 * Here we will create a HashSet
		 * Notice there is a difference between the addAll method for Set interface  vs  addAll method for Collections or List Interface 
		 * 
		 * Elements in a SET do not have an index. 
		 * SETS do not have duplicate elements. 
		 * 
		 */
		
		Set<Integer> numberSet = new HashSet<>();
		numberSet.addAll(numberlist2);   			// just added my List to the Set
		System.out.println("Set:  ");
		System.out.println(numberSet);  		//	NO DUPLICATES
		System.out.println();
		numberSet.forEach(n-> System.out.print(n + " "));
		
		
		/*
		 * Troubleshooting 
		 */
		
		
		Collection<Integer> collection = new ConcurrentLinkedQueue<Integer>();
		for (int i = 1; i < 21; i++)
		{
			collection.add(i);
		}
		System.out.println("Total no : " + collection);
		// removes all the elements which satisfies the predicate filter
		Predicate<Integer> sr = a -> (a % 6== 0);
		// remove all the elements which do not come in 2's table
		collection.removeIf(sr);
		System.out.println(" Table of 2 = " + collection);
		
		List<Integer> numb2 = new ArrayList<>(); 
		for (int i = 1; i < 21; i++)
		{
			numb2.add(i);
		}
		System.out.println("Total no : " + numb2);
		// removes all the elements which satisfies the predicate filter
		Predicate<Integer> print = a -> (a % 2!= 0);
		// remove all the elements which do not come in 2's table
		collection.removeIf(print);
		System.out.println(" Table of 2 = " + print);
		
		
		
		
	}



	private static void demoForEachWithListOfStrings()
	{
		List<String> instruments = new ArrayList<>();
		Collections.addAll(instruments, "Bong", "Bugle", "Chello", "Chime", 
				"Flute", "Piano", "Taiko", "Viola"); 
		System.out.println("instruments: " + instruments);
		
		for(String el : instruments)
		{
			System.out.print("[" + el + "] ");
		}
		System.out.println();
		
		
		// Collection comes from Iterable and 
		// Iterable Interface has a method called forEach that accepts 
		// a Interface Consumer <T> -> Interface functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
		
		instruments.forEach(el -> System.out.print("[" + el + "] "));
		System.out.println();
		instruments.forEach(el -> System.out.print("[" + el.toLowerCase() + "] "));
		System.out.println();
		instruments.forEach(el -> System.out.print("[" + el.toUpperCase() + "] "));
		System.out.println();
		
		instruments.forEach(el -> System.out.print(" | " + el + " | " + el));
	}

}
