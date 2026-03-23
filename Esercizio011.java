package test;

public class Esercizio011 
{

	public static void main(String[] args) 
	{
		// calcolo dei numeri di fibonacci
		// i numeri di fibonacci sono
		// 1 per n = 0
		// 1 per n = 1
		// fib(n-1)+fib(n-2) per n>1
		
		// esempio: fib(3) = fib(2) + fib(1) = fib(1)+fib(1)+fib(1) = 3
		// ogni numero è dato dalla somma dei due precedenti
		// fib(5) = 8
		System.out.println(fibonacci(5));		
	}
	
	// soluzione ricorsiva, il metodo fibonacci richiama se stesso con valori diversi ogni volta. elegante
	// ma pessima in termini di prestazioni
	private static int fibonacci(int n)
	{
		return n<=1 ? 1 : fibonacci(n-1) + fibonacci(n-2);
	}
	

}
