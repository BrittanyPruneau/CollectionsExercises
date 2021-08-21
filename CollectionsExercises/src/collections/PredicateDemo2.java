package collections;

import java.util.function.Predicate;
import java.util.*;

public class PredicateDemo2
{
	public static void main(String[] args)
	{
		List<Integer> numList = Arrays.asList(8, 9, 7, 2, 3, 10, 7);
		// test 1
		System.out.println("Test1:  ");
		Predicate<Integer> condition = (x) -> x>5;
		boolean testing = condition.test(numList.get(5));
		System.out.println(testing);
		
		//numList.removeIf((x) -> x>5);
		
		System.out.println(numList);
		
		//printFilter(numList, (x) -> x>5);
		
		
		
		List<String> numList3 = Arrays.asList("blue", "red", "yellow");
		for(Iterator<String> iterator = numList3.iterator(); iterator.hasNext();)
		{
			String numb = iterator.next();
			if(numb.contains("blue"));
			{
				iterator.remove();
			}
		}
		System.out.println(numList3);

	}
	

	
	public static void printFilter(List<Integer> numbs, Predicate<Integer> condition)
	{
		for (int i=0; i<numbs.size(); i++)
		{
			if (condition.test(numbs.get(i)))
			{
				numbs.remove(i);
			}
			System.out.println(numbs);
		}
	}
}

	

