package test;

import java.util.ArrayList;
import java.util.List;

public class Esercizio015 
{
	
	private static class Token
	{
		int length;
		String c;
		
		public Token(int l, String c)
		{
			this.length = l;
			this.c = c;
		}
		
		public String toString()
		{
			return length>2 ? length+c : c;
		}
		
	}

	public static void main(String[] args) 
	{
		// compressione RLE
		
		// abbiamo una stringa di questo tipo, composta di soli caratteri alfabetici, niente numeri né punteggiatura
		// AAAAAAAAAAAABBBBBCCCDEFFAAAAA. La comprimo usando i numeri e indicando quante volte di fila deve comparire la lettera a
		// quindi la stringa di sopra diventa:
		// 12A5B3CDEFF5A
		// notate che non vale la pena di comprimere le due FF di fila... non guadagnerei caratteri
		
		// questa si chiama "compressione RLE" ed era usata per le immagini uniformi, specie B/N
		
		System.out.println(rleCompress("AAAAAAAAAAAABBBBBCCCDEFFAAAAA"));
		
	}

	private static String rleCompress(String plain) 
	{
		// spezzo la stringa ogni volta in cui un carattere cambia
		// e ottengo una lista di pezzetti da gestire
		// non posso usare split perché split lavora carattere per carattere
		// qui devo confrontare ogni carattere con quello che viene dopo
		// i pezzetti saranno detti "token", saranno composti da un numero e da una lettera
		// e li definisco tramite una classe interna, privata
		
		List<Token> parts = new ArrayList<Token>();
		
		// cominciamo a contare dal primo carattere
		int start = 0;
		for(int i=1;i<plain.length();i++)
			if(plain.charAt(i)!=plain.charAt(i-1))
			{
				// abbiamo un break o siamo all'ultima posizione
				// o abbiamo finito
				// estraiamo una sottostring dal vecchio start alla posizione i
				// devo capire di che carattere di tratta e quanto è lunga la sequenza
				parts.add(new Token(i-start, plain.charAt(i-1)+""));
				// imposto una nuova partenza
				start = i;
			}
		// il for di prima non consuma tutta la stringa. L'ultima parte rimane "vuota"
		if(start<plain.length()) // non abbiamo preso fino all'ultima posizione, prendiamo quello che rimane, da start a length, col carattere finale
			parts.add(new Token(plain.length()-start, plain.charAt(plain.length()-1)+""));		
		
		// ora rimetto assieme la stringa
		String res = "";
		for(Token t:parts)
			res+=t; // invoca il toString()		
		
		return res;
	}

	
	
}
