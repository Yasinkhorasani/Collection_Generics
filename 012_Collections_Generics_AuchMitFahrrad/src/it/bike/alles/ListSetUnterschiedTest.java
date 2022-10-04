package it.bike.alles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.band.bike.Fahrrad;
import com.band.bike.Klingel;

/**
 * Referenzen Set und List
 * Set:unsortiert und keine Duplikate
 * List: sortiert und Duplikate
 * 
 * Referenztyp ArrayList nicht üblich, sondern: Referenztyp List
 * @author Alfa
 *
 */
public class ListSetUnterschiedTest {

	public static void main(String[] args) {
		Collection<String> beispielList = new ArrayList<>();
		Collection<String> besipeilSet = new HashSet<>();
		
		List<String> namensListe = new ArrayList<>();
		namensListe.add("Justus Jonas");
		namensListe.add("Bob Andrews");
		namensListe.add("Peter Shaw");
		namensListe.add(0, "Pumuckl");
		System.out.println(namensListe);
		
		String entfernt = namensListe.remove(1);
		System.out.println("Entfernt wurde: " + entfernt);
		
		namensListe.add("Birgit");
		namensListe.add("Yasin");
		namensListe.add("Payal");
		namensListe.add("Ertekin");
		namensListe.add("Adriano");
		System.out.println(namensListe);

		Collections.sort(namensListe);
		System.out.println(namensListe);
		
		List<Fahrrad> fahrradListe = new ArrayList<>();
		fahrradListe.add(new Fahrrad());
		fahrradListe.add(new Fahrrad("Grün", "Citybike", 20, LocalDate.of(2022, 10, 1)));
		fahrradListe.add(0, new Fahrrad("Weiß", "Fahrrad", 1, LocalDate.of(1970,1,1)));
		fahrradListe.get(0).setKlingel(new Klingel("Gold", "Richman", 100));
		for(int i = 0; i < fahrradListe.size(); i++) { 
			System.out.println(fahrradListe.get(i));
		}
//		Collections.sort(fahrradListe);
//		Collections.sort: siehe Amigurumi-Projekt
		//sort: 
		Set<String> namensMenge = new HashSet<>();
		namensMenge.add("Birgit");
		namensMenge.add("Yasin");
		namensMenge.add("Payal");
		namensMenge.add("Ertekin");
		namensMenge.add("Adriano");
		for(int i = 0; i < namensMenge.size(); i++) {
//			System.out.println(namensMenge.get(i));
		}
//		Collections.sort(namensMenge);
		namensMenge.add(new String("Susanne"));
		
//		String doz = namensMenge.toString();
	}

}





