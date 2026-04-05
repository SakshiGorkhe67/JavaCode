package Strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using String BUilder
		StringBuilder sb=new StringBuilder("Hello");
		sb.reverse();
		System.out.println("Firse Reverse: "+sb);
		
		//Using string literal
		
		String str="aba";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);}
		System.out.println(rev);
		
		//Palindrome String
		
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println(" Not Palindrome");
		}
		

	}

}
