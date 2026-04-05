package Strings;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sakshi";
		int vowel=0;
		int cons=0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				if("aeiou".indexOf(ch)!=-1) {
					vowel++;
				}
				else {
					cons++;
				}
			}
			
			
		}
		System.out.println("Vowel:"+vowel);
		System.out.println("Consonant:"+cons);
		
		

	}

}
