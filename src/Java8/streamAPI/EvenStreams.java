package Java8.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class EvenStreams {

	public static void main(String[] args) {


		    // 1. Even numbers
		   //filter() applies condition

			List<Integer>list= Arrays.asList(1,2,3,4,5,1,2,3);
			List<Integer> evenList=list.stream().filter(n->n%2==0).toList();
		    System.out.println(evenList);


			// 2. Square Each number
		   //map() transforms data

		   List<Integer>sqaureList=list.stream().map(n->n*n).toList();
		   System.out.println(sqaureList);


		   //3.Remove Duplicate
		  //distinct() removes duplicates

		List<Integer>distinctElement=list.stream().distinct().toList();
		System.out.println(distinctElement);

		// 4. Sort List in ascending

		System.out.println("Ascending Sorted");
		list.stream().sorted().toList().forEach(System.out::println);


		//Sort List in descending
		System.out.println("Descentding Sorted");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// 5. Find maximun number

		int max=list.stream().max(Integer::compare).get();
		System.out.println("Maximum number is: "+max);

		// 6. Count Element

		long count=list.stream().count();
		System.out.println("Count is :"+count);

		// 7. Convert list of string to uppercase
		List<String> names=Arrays.asList("Sakshi","Gorkhe");
		names.stream().map(String::toUpperCase).forEach(System.out::println);

		// 8. Find First Element

	    Optional<Integer> n=list.stream().findFirst();
		System.out.println("First value:"+n);

		list.stream().findFirst().ifPresent(System.out::println);


		// 9. Sum of all elements

		int sum=list.stream().reduce(0,(a,b)->a+b);
		System.out.println("sum is:"+sum);


		// 10. Filter string starting with S

		names.stream().filter(name->name.startsWith("S")).forEach(System.out::println);

       //11. Check if any number is greater than 10

		boolean bool=list.stream().anyMatch(x->x>10);
		System.out.println(bool);

        // 12. Check if all numbers are positive

		 boolean result=list.stream().allMatch(y->y>0);
		System.out.println(result);


		//13 Skip first 3 element

		list.stream().skip(3).forEach(System.out::println);

		// 14 .Get first 3 numbers

		list.stream().limit(3).forEach(System.out::println);






		

	}

}
