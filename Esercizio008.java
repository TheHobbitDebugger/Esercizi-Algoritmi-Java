package test;

public class Esercizio008 
{

	public static void main(String[] args) 
	{
		// prendere come riferimento l'esercizio 7
		// date due stringhe
		// decidere se i caratteri della seconda stringa sono contenuti nella prima
		// esempio:    OSSIMORO contiene MOSSI (true)
		// OSSIMORO non contiene MOSSA (false)
		// in questo caso le frequenze non devono essere uguali
		// ma le frequenze della prima devono essere sempre uguali o superiori a quelle della seconda
		// per tutti i caratteri della seconda
		// bisogna scorrere i caratteri della seconda e confrontare le loro frequenze nella seconda parola con le frequenze della prima
		
		System.out.println(containsCharacters("OSSIMORO", "MOSSI")); // true
		System.out.println(containsCharacters("OSSIMORO", "MOSSA")); // false
	}

	private static boolean containsCharacters(String string, String string2) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
