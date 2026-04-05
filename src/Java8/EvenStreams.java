package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class EvenStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		List<Integer> evens=numbers.stream()
				            .filter(n->n%2==0)
				            .collect(Collectors.toList());
		System.out.println(evens);
		

	}

}
