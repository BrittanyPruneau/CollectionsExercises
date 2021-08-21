package collections;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DemoCollection
{

	public static void main(String[] args)
	{
		List<Integer> numbers = new ArrayList<Integer>();
		Collections.addAll(numbers, 10, 20, 30, 40, 50, 60, 70);
		System.out.println("Original list: " + numbers);
		Collections.fill(numbers, 7);
		System.out.println("List replaced with all 7's " + numbers);

		Collections.rotate(numbers, -3);
		System.out.println("Rotated list : " + numbers);

		/*
		 * Exchange the second element with the second last element Print the list.
		 */
		Collections.swap(numbers, 1, numbers.size() - 2);
		System.out.println("Exchange el: " + numbers);

		/*
		 * Call binarySearch on the current list numbers and look for the element 50.
		 * Print the result and check for correctness.
		 */
		// THE LIST NEEDS TO BE SORTED IN ORDER TO DO A BINARY SEARCH
		int result = Collections.binarySearch(numbers, 50);
		System.out.printf("Number 50 is on index %d%n", result);

		// Here will wil try again, with the list sorted.
		Collections.sort(numbers);
		System.out.println("sorted list : " + numbers);
		result = Collections.binarySearch(numbers, 50);
		System.out.printf("Number 50 is on index %d%n", result);

		// Rearrange in random order.
		Collections.shuffle(numbers);
		System.out.println("Shuffled list:" + numbers);

		List<Character> letters = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'));
		List<Character> vowels = new ArrayList<>(); // empty list
		Collections.addAll(vowels, 'O', 'I', 'O', 'U', 'O');

		// Check whether letters and vowels have an in common!!

		boolean result2 = Collections.disjoint(letters, vowels);
		System.out.println("Anything in common: " + result2);

		/*
		 * In the list vowels, exchange all occurrences of O with A. [O, I, O, U, O]
		 * should turn into [A, I, A, U, A]
		 */
		Collections.replaceAll(vowels, 'O', 'A');

		List<Character> letters2 = Arrays.asList('a', 'r', 'o', 'u', 'n', 'd');
		Collections.sort(letters2, Collections.reverseOrder());
		System.out.println("letters 2: " + letters2);

		List<Character> letters3 = Arrays.asList('a', 'r', 'o', 'u', 'n', 'd');
		Collections.reverse(letters3);
		System.out.println("Letters 3: " + letters3);

		Collections.sort(letters2);
		System.out.println(letters2);

		// Video Demo

		ArrayList<Double> list = new ArrayList<>();
		List<Double> lists = new ArrayList<>();
		for (double n = 10.5; n <= 99.5; n++)
		{
			lists.add(n);
		}

		System.out.println("lists : " + lists);
		lists.size();
		for (int i = 1; i < lists.size(); i++)
		{
			System.out.print(lists.get(i) + " ");
		}

		lists.removeIf(n -> (n > 13.5 && n < 67));
		System.out.println("greater than 72 is removed" + lists);

		// When you remove elements incrementally THE LIST CHANGES AND
		// SO NOW THE ELEMENTS WILL BE DIFFERENT EVERY TIME YOU SHIFT/REMOVE.
		// If you remove elements from the back first going backwards this wont happen.
		// !!!!!

		List<Integer> list33 = new ArrayList<>();
		for (int n = 10; n <= 99; n++)
		{
			list33.add(n);
		}
		
		for(int i =list33.size()-1; i>=0; i--)
		{
			if(i%2 ==0)
			{
				list33.remove(i); 
			}
		}
	
		System.out.println("using remove" + list33);

	}
}
