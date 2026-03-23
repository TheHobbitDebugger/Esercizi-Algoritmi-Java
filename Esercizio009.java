package test;

public class Esercizio009 
{

	public static void main(String[] args) 
	{
		// dato un vettore di numeri, calcolare il numero massimo di elementi crescenti consecutivi
		
		// esempio
		// dato v = [5, 10, 15, 20, 18, 17, 26, 30, 41, 50]
		// il risultato deve essere 5 (la sequenza 17,26,30,41,50 è lunga 5)
		
		System.out.println(calculateRisingTrendLength(new int[] {5, 10, 15, 20, 18, 17, 26, 30, 41, 50, 1}));
		
	}

	private static int calculateRisingTrendLength(int[] v) 
	{
		int max = 1;
		int currentSequenceLength = 1;
		for(int i=1;i<v.length;i++)
		{
			if(v[i]>v[i-1]) // siamo ancora in fase crescente
			{
				currentSequenceLength++;
				// ma dobbiamo verificare se abbiamo finito 
				if(i==v.length-1)
					if(currentSequenceLength>max)
						max = currentSequenceLength;
			}
			else
			{
				// trovata una sequenza crescente, ma si è interrotta. Vediamo se era più lunga della precedente.				// vedo se era più lunga della precedente
				if(currentSequenceLength>max)
					max = currentSequenceLength;
				// e riparto da 1
				currentSequenceLength = 1;
			}			
		}
		
		return max;
	}

}
