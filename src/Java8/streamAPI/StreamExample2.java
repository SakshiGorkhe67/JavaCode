package Java8.streamAPI;

import java.util.*;
import java.util.stream.Collectors;


//Sort employees by salary.
class Employee{
	String name;
	int salary;
	 
	Employee(String name,int salary)
	{
	this.name=name;
	this.salary=salary;
	}
	public String toString() {
		return name+":"+salary;
		}
	List<Employee>employees=Arrays.asList(new Employee("Alice",5000),
			                              new Employee("Bob",3000));
	List<Employee>sorted=employees.stream()
			                      .sorted(Comparator.comparingInt(e->e.salary))
			                      .collect(Collectors.toList());
	
	

	}

public class StreamExample2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      1.Print a list using Lambda Expressions .
		List<String> names= Arrays.asList("Alice","Bob");
		names.forEach(name->System.out.println(name));
		
		
//     2.Filter even numbers from a list using Streams.
	   List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8);
	   List<Integer>even=numbers.stream()
			                    .filter(n->n%2==0)
			                    .collect(Collectors.toList());
	   System.out.println(even);
	   
//     3.Find the maximum value in a list using Streams.
	   List<Integer>number=Arrays.asList(10,20,30,40);
	   int max=number.stream()
			         .max(Integer::compare)
			         .orElse(0);
	   System.out.println(max);
	   
//     4.Convert a list of strings to uppercase.	  
	   List<String>lowerName=Arrays.asList("alice","bob");
	   List<String>upperName=lowerName.stream()
			                          .map(String::toUpperCase)
			                          .collect(Collectors.toList());
	   System.out.println(upperName);
	   
//     5.Group strings by their length using groupingBy() .
	   List<String> name=Arrays.asList("Alice","Bob");
	   Map<Integer,List<String>> grouped=name.stream()
			                                 .collect(Collectors.groupingBy(String::length));
	   System.out.println(grouped);
	   
//     6.Find the sum of numbers using reduce() .
	   List<Integer>num=Arrays.asList(1,2,3,4);
	   int Sum=num.stream()
			      .reduce(0,Integer::sum);
	   System.out.println(Sum);
	   
//    7.Count word occurrences in a list using groupingBy() .
	  List<String>words=Arrays.asList("apple","banana","apple");
	  Map<String,Long> wordCount=words.stream()
			                             .collect(Collectors.groupingBy(w->w,Collectors.counting()));
	  
	  System.out.println(wordCount); 

//    8.Concatenate strings using joining() .
	  List<String>word=Arrays.asList("Java","is","awesome");
	  String sentence=word.stream()
			              .collect(Collectors.joining(" "));
	  System.out.println(sentence); 
	   
	   

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
