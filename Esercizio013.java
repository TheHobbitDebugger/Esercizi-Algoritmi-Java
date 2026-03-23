package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Esercizio013 
{

	private static class Student
	{
		int year;
		String section;
		String name;
		
		public Student(String name, String section, int year)
		{
			this.name = name;
			this.section = section;
			this.year = year;
		}
		
		public String toString()
		{
			return this.name+" "+this.year+this.section;
		}
	}
	
	public static void main(String[] args) 
	{
		// riclassificare, raggruppare
		// ho creato una classe privata coi dati di alcuni studenti
		// e li voglio separare in una mappa in base all'anno scolastico
		// per averli divisi per anno
		// e poi voglio stampare solo gli studenti di quinta delle sezioni A e C
		
		// parto da un vettore di studenti
		Student[] students = new Student[]
		{
			new Student("Paul", "A", 5),
			new Student("John", "A", 5),
			new Student("Mary", "B", 5),
			new Student("Jay", "A", 4),
			new Student("Marv", "C",5)
		};
		
		// mappa con chiave intero (la classe) e valore LISTA DI STUDENTI
		Map<Integer,List<Student>> studentMap = new HashMap<Integer, List<Student>>();
		
		// scorro gli studenti e li sposto nella mappa, creando una coppia chiave-valore per ogni anno. L'anno è la chiave
		
		for(Student s:students)
		{
			int year = s.year;
			// non ho questo anno, devo creare la coppia con chiave anno e valore lista in memoria
			if(!studentMap.containsKey(year))
				studentMap.put(year, new ArrayList<Student>()); // inizialmente vuota
			// aggiungo lo studente
			studentMap.get(year).add(s);
		}
		
		// stampo solo gli studenti di quinta delle sezioni A o C
		System.out.println(studentMap.get(5).stream().filter(x->x.section.equals("A") || x.section.equals("C")).toList());
		
	}

}
