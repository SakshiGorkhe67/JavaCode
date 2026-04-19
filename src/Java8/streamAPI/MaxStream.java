package Java8.streamAPI;

import java.util.*;

public class MaxStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(10,20,30,40);
		int max=numbers.stream()
				.max(Integer:: compare).orElse(0);
				
		System.out.println(max);
		
				
		

	}

}
