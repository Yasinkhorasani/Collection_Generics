package it.bike.alles;

import java.util.ArrayList;
import java.util.Collection;

import com.band.bike.Fahrrad;
/**
 * Demonstriert typisierte Listen: Generics: Diamantoperator: <>
 * @author Alfa
 *
 */

public class GenericTest {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Collection<Fahrrad> fahrraeder = new ArrayList<Fahrrad>();
		fahrraeder.add(new Fahrrad());
//		fahrraeder.add("Justus Jonas");
//		fahrraeder.add(123);
		System.out.println(fahrraeder);
		
		@SuppressWarnings("rawtypes")
		Collection meineListe = new FahrradListe();
		meineListe.add(new Fahrrad());
		System.out.println(meineListe);
		
		for(Fahrrad bike : fahrraeder) {
			System.out.println(bike.getKlingel());
		}
		
		for(Object bike : meineListe) {
			Fahrrad fahrradHelfer = (Fahrrad) bike;
			System.out.println(fahrradHelfer.getKlingel());
		}
		
		
	}
}
