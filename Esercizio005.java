package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Esercizio005 
{

	public static void main(String[] args) 
	{
		// mediana
		
		// posto un vettore di numeri interi
		// ad esempio:
		// [10, 9, 10, 11, 5, 8, 10] 
		// calcolare la mediana
		// la mediana è il numero che sta esattamente in mezzo se il vettore ha un numero dispari di elementi
		// è il numero per cui abbiamo metà numeri sopra (o uguali) e metà numeri sotto (o uguali)
		
		// si calcola così:
		// si ordina il vettore (o lista)
		// [10, 9, 10, 11, 5, 8, 10] diventa [5,8,9,10,10,10,11]
		// si prende l'elemento centrale. Essendo sette numeri, l'elemento centrale è l'elemento con indice 3 (il quarto), quindi il primo 10
		// se il vettore ha dimensioni pari, si prendono i DUE numeri centrali e si fa la media dei due numeri centrali
		
		// vettore dispari, elemento centrale, 10
		System.out.println(median(new int[]{10, 9, 10, 11, 5, 8, 10}));
		// vettore pari, media degli elementi centrali
		System.out.println(median(new int[]{7, 3, 4, 6}));
		
	}

	private static double median(int[] numbers) 
	{
		// 1 - devo ordinare il vettore
		// a tale scopo, prima lo trasformo in lista
		List<Integer> list = new ArrayList<Integer>();
		for(int n:numbers)
			list.add(n);
		
		Collections.sort(list);
		
		// devo vedere se il vettore ha lunghezza dispari o pari
		
		boolean odd = numbers.length % 2 == 1; // che vuol dire questo? cercatelo...
		
		if(odd)
			return list.get(numbers.length / 2);
		else
			return (list.get(numbers.length/2-1) + list.get(numbers.length/2)) / 2;
		// altrimenti è pari...
		
		
		
	}
	
	

}
