package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Esercizio001 
{

	
	private static String rework(String input)
	{
		// 1 - estrarre le vocali e le consonanti
		List<Character> vowels		 = new ArrayList<Character>();
		List<Character> nonVowels	 = new ArrayList<Character>();
		
		for(int i=0;i<input.length();i++)
		{
			char c = input.charAt(i);
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
				vowels.add(c);
			else
				nonVowels.add(c);
		}
		
		// ordino entrambe
		Collections.sort(vowels);
		Collections.sort(nonVowels);
		String res = "";
		for(Character c:vowels)
			res+=c;
		for(Character c:nonVowels)
			res+=c;
		return res;
		
	}
	
	public static void main(String[] args) 
	{
		// data una stringa, riassemblarla mettendo prima le vocali e poi le consonanti
		// in ordine!
		// esempio:
		
		// ABACO => AAOBC
		
		System.out.println(rework("ABACO"));		
	}

}
