package test;

public class Esercizio061 
{

	public static void main(String[] args) 
	{
		int[] v = {10, 2, 6,7, 5, 3, 2};
		
		System.out.println(sumAndSubstract(v));		
	}

	private static int sumAndSubstract(int[] v) 
	{
		int res=0;
		for(int i=0;i<v.length/2;res+=(v[i]-v[v.length-i-1]),i++);
		return res;
	}
	// ESECUZIONE SIMBOLICA di sumAndSubstract di v
}
