package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Esercizio003 
{

	public static void main(String[] args) 
	{
		// rimozione dei duplicati
		
		// partendo da una stringa di tags, ad esempio
		// #java,#sql,#angular,#java
		// produrre un'altra stringa che rimuova i duplicati
		// e ordini in ordine alfabetico
		// es: #angular,#java,#sql
		
		System.out.println(removeDuplicates("#java,#sql,#angular,#java"));
		
		
	}

	private static String removeDuplicates(String tags) 
	{
		String[] parts = tags.split(",");
		// spezzo e ottengo il vettore

		// aggiungo a un set, per eliminare i duplicati
		Set<String> tagSet = new HashSet<String>();
		for(String part:parts)
			tagSet.add(part);
		
		// riporto in una lista, per poterlo ordinare
		List<String> tagList = new ArrayList<String>();
		tagList.addAll(tagSet);
		
		// lo ordino...
		Collections.sort(tagList);
		
		// ricostruisco la stringa, ma questo ve lo studiate voi
		String res = "";
		for(int i=0;i<tagList.size();i++)
			res+="#"+tagList.get(i)+(i<tagList.size()-1 ? "," : "");
		
		return res;
	}

}
