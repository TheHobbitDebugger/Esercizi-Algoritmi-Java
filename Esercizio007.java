package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Esercizio007 
{

	public static void main(String[] args) 
	{
		// calcolare la frequenza delle lettere in una parola
		// mantenendo l'ordine di comparsa nella parola
		// e poi vedere se una parola è un anagramma di un'altra
		// due parole sono anagrammi se hanno le stesse frequenze per tutte le lettere
		// esempio: ASSO ed OSSA sono anagrammi. entrambi hanno {A=>1, S=>2, O=>1}
		Map<Character,Integer> freq = calculateFreqs("ABACO");
		// A=>2, B=>1, C=>1, O=>1
		System.out.println(freq);
		
		// e come faccio a vedere se due stringhe sono una anagramma dell'altra?
		// hanno le stesse frequenze
		// perché equals e non ==?
		System.out.println(calculateFreqs("OSSA").equals(calculateFreqs("ASSO"))); // true
		System.out.println(calculateFreqs("OSSA").equals(calculateFreqs("ASSI"))); // false
			
		
	}
	
	public static Map<Character,Integer> calculateFreqs(String s)
	{
		// cosa diavolo era una mappa? Insieme di coppie chiave - valore... andatelo a riguardare sul libro...
		// perché linkedHashMap invece di HashMap? parliamone...
		Map<Character,Integer> freqs = new LinkedHashMap<Character,Integer>();
		// scorro la stringa carattere per carattere
		// se ho già il carattere nella mappa segnalo che lo ho incontrato di nuovo, aumento la frequenza
		// altrimenti, imposto 1 (prima volta che lo trovo)
		
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(freqs.containsKey(c)) // lo conosco già
			{
				int oldValue = freqs.get(c); // prendo il vecchio valore
				int newValue = oldValue + 1;
				// aggiorno
				freqs.put(c, newValue);
			}
			else
				freqs.put(c, 1); // prima volta..
		}
		return freqs;
	}
	
	
	

}
