package Basics;

import java.util.*;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="testing";
		Map<Character,Integer>map=new HashMap<>();
		
		for(char ch:str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		for (Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		

	}

}
