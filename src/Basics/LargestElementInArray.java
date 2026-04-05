package Basics;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[]{1,2,3,4,5};
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			
				
			
		}
		System.out.println("Maximum value is"+max);
		
		
		// swapping 2 numbers with third variable
		int a=20;
		int b=10;
		int c;
		System.out.println("Before swap");
		System.out.println("a:"+a+"," +"b:"+b);
		c=a;
		a=b;
		b=c;
		System.out.println("after swap");
		System.out.println("a:"+a+"," +"b:"+b);
		
		
		//Swapping without third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a+"," +"b:"+b);
		
				
		
	}

}
