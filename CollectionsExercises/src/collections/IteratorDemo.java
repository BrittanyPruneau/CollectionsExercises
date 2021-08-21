package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class IteratorDemo
{

	public static void main(String[] args)
	{
		List<String> cities = new ArrayList<>(Arrays.asList("Avon", "Cleavland", "Rocky River", "Lakewood", "Maple Heights", "Parma", "WestLake")); 
		System.out.println(cities);
		
		for(Iterator<String> iterator = cities.iterator(); iterator.hasNext(); )
		{
			String city = iterator.next();
					if(city.contains(" "))
					{
						iterator.remove();
					}
		}
		System.out.println(cities);
		
		
		/*
		 * Using iterator to remove elements. 
		 */
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)); 
		System.out.println(numbers);
		
		for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); )
		{
			Integer number = iterator.next();
					if(number%2==0)
					{
						iterator.remove();
					}
		}
		System.out.println(numbers);
		
		numbers.remove(3);
		System.out.println(numbers);
		
		/*
		 * Using remove without iterator by going backwards. 
		 */
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
		
		/*
		 * Using predicate class and lambda expression
		 */

		List<Integer> numList = Arrays.asList(8, 9, 7, 2, 3, 10, 7);
		// test 1
		System.out.println("Test1:  ");
		
		Predicate<Integer> i = (s)-> s==8;
		System.out.println(i.test(numList.get(0)));
		
		Predicate<String> l = (s)-> s.contains("love");
		List<String> strings = new ArrayList<>();
		strings.add("love"); 
		strings.add("my");
		strings.add("bofriend"); 
		System.out.println(l.test(strings.get(0)));
		
		for(int j=strings.size()-1; j>=0; j--)
		{
			if(l.test(strings.get(j)))
			{
				System.out.println("removing: "+ strings.get(j));
				strings.remove(j);
			}
			System.out.println(strings);
		}
		
		/*
		 * not working 
		 */
		System.out.println();
		List<String> strings33 = new ArrayList<>();
		strings33.add("blue");
		strings33.add("yellow");
		strings33.add("green");
		System.out.println("printing strings 33: " + strings33);
		
		for(Iterator<String> it = strings33.iterator(); it.hasNext();)
		{
			String string = (String)it.next();
			if(string.equals("yellow"));
			{
				it.remove();
				System.out.println("removing " + string);
			}
		}

		System.out.println();
		
		
		
		/*
		 * working
		 */
		
		ArrayList<String> aList = new ArrayList<String>();
	      aList.add("Apple");
	      aList.add("Mango");
	      aList.add("Guava");
	      aList.add("Orange");
	      aList.add("Peach");
	      System.out.println("The ArrayList elements are: ");
	      for (String s: aList) 
	      {
	         System.out.println(s);
	      }
	      Iterator k = aList.iterator();
	      String str = "";
	      while (k.hasNext()) 
	      {
	         str = (String) k.next();
	         if (str.equals("Orange")) 
	         {
	            k.remove();
	            System.out.println("\nThe element Orange is removed");
	            break;
	         }
	      }
	      System.out.println("\nThe ArrayList elements are: ");
	      for (String s: aList) {
	         System.out.println(s);
		
	}

}
}
