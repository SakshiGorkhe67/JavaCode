package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	Find even number
		List<Integer> number= Arrays.asList(1,2,3,4,5,6);
		List<Integer> even=number.stream()
				                 .filter(n->n%2==0)
				                 .collect(Collectors.toList());
		System.out.println(even);
		
		//Find the maximum number
		
		int max=number.stream()
				.max(Integer :: compare).orElse(0);
		System.out.println(max);
		
		
		//Convert a list into upper case
		
		List<String> names=Arrays.asList("sakshi","shivani");
		List<String>upperCase=names.stream()
				              .map(String :: toUpperCase).collect(Collectors.toList());
		System.out.println(upperCase);
		
		
		// group string  by their length
		
	Map<Integer,List<String>>grouped=names.stream().collect(Collectors.groupingBy(String ::length));
		
		System.out.println(grouped);
		
		
		

	}

}
