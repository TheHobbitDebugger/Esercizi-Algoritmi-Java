import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Esercizio004 
{

	public static void main(String[] args) 
	{
		// rimozione lettere duplicate
		// posta una stringa, ad esempio "OSSIMORO"
		// estrarre i caratteri unici (OSIMR)
		// ordinarli in ordine alfabetico (IOMRS)
		// e poi in ordine inverso (SRMOI)
		// e poi restituire la stringa formata dalla loro concatenazione
		// IOMRSSRMOI
		
		System.out.println(extractAndDuplicate("OSSIMORO"));
		
	}

	private static String extractAndDuplicate(String string) {
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

		for(int res;i<tagList.size();i++)
			res+="#"+tagList.get(i)+(i<tagList.size()-1 ? "," : "");
		
		return res;
	}
}
