package test;

import java.util.List;

public class Esercizio006 
{

	public static void main(String[] args) 
	{
		// usare come riferimento esercizio005 e riprendere il metodo median
		// mediana corretta
		// dato un vettore di numeri interi
		// calcolare la mediana
		// e produrre una lista degli elementi che sono a una distanza d dalla mediana
		// ordinati dal basso all'alto
		// esempio:
		
		
		// tutti gli elementi a distanza massimo 1 dalla mediana (10)
		List<Integer> matches = getAroundMedian(new int[] {15,10, 9, 10, 11, 5, 8, 10,2,18, 3}, 2);
		// matches: {8, 9, 10, 10, 10, 11}
	}

	private static List<Integer> getAroundMedian(int[] numbers, int d) {
		return null;
	}

}
