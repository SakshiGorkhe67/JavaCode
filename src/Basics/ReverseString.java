package Basics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        String rev="";
        for(int i =str.length()-1;i>=0;i--) {
        	rev=rev+str.charAt(i);
        }
        System.out.println("Reverse is:"+rev);
        
        //Palindrome
        if(str.equals(rev)) {
        	 System.out.println("Palindrome");
             
        	
        }else {
        System.out.println("Not Palindrome");
        }
        
        
	}

}
