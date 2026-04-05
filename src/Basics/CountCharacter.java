package Basics;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sakshi";
		String vowel="aeiou";
		int j=0;
		int vcount=0;
		int Ccount=0;
		for(int i=0;i<str.length();i++)
         {
			if(str.charAt(i)==vowel.charAt(j))
			{
				vcount++;
				j++;
			}
			else {
				Ccount++;
			}
			
			
			
				
			}
			
			
			
        	 
	     
		System.out.println("Vowel:"+vcount+","+"Consonent:"+Ccount);

		

	}

}
