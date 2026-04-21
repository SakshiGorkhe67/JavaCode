package Java8.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class BasicStream {

	public static void main(String[] args) {

		/*👉 These 5 methods are your core toolkit:

           filter() → condition
           map() → transform
           sorted() → order
           limit()/skip() → control
            collect() → result*/


		    // 1. Even numbers
		   //filter() applies condition

			List<Integer>list= Arrays.asList(6,2,3,4,5,1,2,3,6,25);
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

		// 15.Join list of string into a single string
		names.stream().collect(Collectors.joining(","));
		System.out.println(names);

		//16.Find the minimum number
		int min=list.stream().min(Integer::compare).get();
		System.out.println(min);

		//17 Count how many numbers are divisible by 3

		long countnumber=list.stream().filter(a->a%3==0).count();
		System.out.println(countnumber);

		// 18 Conver all names to lowercase

		List<String> toLower=names.stream().map(name->name.toLowerCase()).toList();
		System.out.println(toLower);


		//19 Find first even number
		Optional<Integer> evennumber =list.stream().filter(num->num%2==0).findFirst();
		System.out.println(evennumber);


		//20 Double every number in the list.

		list.stream().map(z->z*2).toList().forEach(System.out::println);

		//21 Find Numbers Greater Than 5
		list.stream().filter(v->v>5).forEach(System.out::println);


		// 22 Convert List to Array

		Integer[] array=list.stream().toArray(Integer[]::new);
		System.out.println(array);


		//23 Check If List is Empty Using Stream

		boolean b=list.stream().findAny().isEmpty();
		System.out.println(b);


		//24 Print Distinct Elements

		list.stream().distinct().forEach(System.out::println);


		// 25 Find Length of Each String

		names.stream().map(String::length).forEach(System.out::println);

		//26 Convert Integers to Strings

		List<String> strList=list.stream().map(String::valueOf).toList();
		System.out.println(strList);

		//27 Get Last Element

		Optional<Integer> last=list.stream().sorted(Comparator.reverseOrder()).findFirst();
		System.out.println(last);

		//28 Count Strings with Length > 3

		long threecount=names.stream().map(f->f.length()>3).count();
		System.out.println(threecount);

		// 29 Find numbers divisible by 5

		list.stream().filter(g->g%5==0).forEach(System.out::println);

		// 30 Check if any string starts with "S"

		names.stream().filter(s->s.startsWith("S")).forEach(System.out::println);




		

	}

}
