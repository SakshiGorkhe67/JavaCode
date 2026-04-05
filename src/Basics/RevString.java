package Basics;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string.");
        String str=sc.next();
        String rev="";
        
        //Reverse a number 
        int num=12345;
        int reverse=0;
        while(num!=0) {
        	int n=num%10; //it will take the last digit
        	reverse=reverse*10+n; //append
        	num=num/10; //remove the last digit
        }
        System.out.println("Reverse is:"+ reverse);
        
        //Reverse string
        for(int i=str.length()-1;i>=0;i--) {
        	rev=rev+str.charAt(i);
        }
        System.out.println("Reverse is:"+ rev);
        
        
        //Using StringBuilder
        String str1="gorkhe";
        StringBuilder sb=new StringBuilder(str1);
        sb.reverse();
        System.out.println("Reverse is:"+ sb);
        
        
        //PALINDROME
        //Here it is checking for memory reference(since string in immutable so it create a new object which is at other memory address that why even if the value is same it is not palindrome
        
        if(str==rev) {
        	System.out.println("is palindrome");
        	
        }
        else {
        	System.out.println("not palindrome");
        }
        
        
        //Here it checks only for value
        
        if(str.equals(rev)) {
        	System.out.println("is palindrome");
        	
        }
        else {
        	System.out.println("not palindrome");
        }
        
        
        
        
	}

}
