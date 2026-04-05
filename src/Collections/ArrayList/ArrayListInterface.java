package Collections;

import java.util.*;

public class ArrayListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stubc
		
		// Create an ArrayList object
		ArrayList<String>cars=new ArrayList<>();
		
		//To add elements to an ArrayList, use the add() method
		cars.add("Swift Desire");
		cars.add("Volvo");
		cars.add("Ford");
		System.out.println(cars);
		//Another useful class in the java.util package is the Collections class, which include the sort()
				System.out.println("Sorted elemenets:");
				
			     Collections.sort(cars);
			     for(String i: cars) {
			    	 System.out.println(i);
			    	 }
		
		//Add element at specified position by referring to the index number
		cars.add(1,"Toyota");
		cars.add("Mahindra");
		cars.add("Volvo");
		System.out.println(cars);
		
		//To access an element in the ArrayList, use the get() method and refer to the index number
		
		System.out.println(cars.get(1));
	  //To modify an element, use the set() method and refer to the index number
		cars.set(1,"Verna");
		System.out.println(cars);
	//To remove an element, use the remove() method and refer to the index number
		cars.remove(0);
		System.out.println(cars);
	//To remove all the elements in the ArrayList, use the clear() method:
	//cars.clear();
	System.out.println(cars);
	
	
	
	//Loop through the elements of an ArrayList with a for loop,
	
	for(int i=0;i<cars.size();i++) {
		System.out.println(cars.get(i));
	}
	//You can also loop through an ArrayList with the for-each loop:
	
	for(String s: cars) {
		System.out.println(s);
		
	    	 
	     
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
