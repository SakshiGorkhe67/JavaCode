package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		
//      1. Given a list of integers, find out all the numbers starting with 1 using Stream Function ?
		List<Integer>numbers=Arrays.asList(123,213,145,167,234);
		List<Integer>ones=numbers.stream().filter(n->String.valueOf(n).startsWith("1")).collect(Collectors.toList());
		System.out.println(ones);
		
//      2.Given a list of String, find out all the string starting with a using Stream function?
		List<String>str=Arrays.asList("abc","bcd","dce");
		List<String>newstr=str.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
		System.out.println(newstr);
		
//      3.write a string program which accept 22,42,56,39 need to pick up those words end with 2?
		String input="22,42,56,39";
		List<String> number=Arrays.asList(input.split(","));
		List<String>selectedNumber=number.stream().filter(n->n.endsWith("2")).collect(Collectors.toList());
		System.out.println(selectedNumber);
		
//	   4. How to find duplicate elements in a given integers list in java using Stream functions?
		
		List<Integer>number1 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 5, 5);
		List<Integer> duplicate=number1.stream().filter(n->Collections.frequency(number1,n)>1) // Filters elements with frequency > 1
				.distinct()//remove duplicate
				.collect(Collectors.toList());
        System.out.println(duplicate);
        
        //Another way
        
        
        Set<Integer>set=new HashSet<>();
        number1.stream().filter(n->!set.add(n)).forEach(System.out::println);
        
//      5. Given the list of integers, find the first element of the list using stream Function?
        List<Integer>list=Arrays.asList(2,3,4,5);
        Optional<Integer> firstElement=list.stream()
        		                           .findFirst();
        if(firstElement.isPresent()) {
        	System.out.println(firstElement);
        }
        
//        6. Given a list of integers, find the total number of elements present in the list using Stream functions?
          List<Integer>list1=Arrays.asList(1,2,3,4,5,6);
          long count=list1.stream().count();
          System.out.println(count);
          
          
//        7. Given a list of integers, find the maximum value element present in it using Stream functions?
          List<Integer>list3=Arrays.asList(1,2,3,4,5,6,7);
          Integer maxValue=list3.stream().max((x,y)->x.compareTo(y)).get();
          System.out.println(maxValue);
          
          
          //Another way
          List<Integer>list4=Arrays.asList(1,2,3,4,5,6,7);
          Optional<Integer> max1=list4.stream().max(Integer::compare);
          System.out.println(max1);
          
//        8. Given a list of integers, sort all the values present in it in descending order using Stream functions?
          List<Integer> list5=Arrays.asList(1,2,3,4,5,6);
          List<Integer>revlist=list5.stream()
        		                     .sorted(Comparator.reverseOrder())
        		                     .collect(Collectors.toList());
          System.out.println(revlist);
          
          
//       9.
          
          ArrayList<String> names=new ArrayList<>();
          names.add("sakshi");
          names.add("shivani");
          Stream<String> listName=names.stream();
          names.forEach(System.out::println);
          
          
//       10. Given a list of integers, find out all the even numbers exist in the list using Stream functions?
         List<Integer> numberss=Arrays.asList(1,2,3,4,5,6,78,9,10);
         List<Integer>even=numberss.stream()
        		                    .filter(n->n%2==0)
        		                    .collect(Collectors.toList());
         even.forEach(System.out::println);
         
         
//       11.remove duplicate number frome the list
         List<Integer>oldList=Arrays.asList(1,2,1,3,4,2,5,6,9);
         List<Integer>newList=oldList.stream().distinct().collect(Collectors.toList());
         newList.forEach(System.out::println);
          
        		                     
        		                      
     

          
		
		
		

	}

}
