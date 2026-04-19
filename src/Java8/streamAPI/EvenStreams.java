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








		

	}

}
