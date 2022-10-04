package it.bike.alles;

import java.util.Collection;

import com.band.bike.Fahrrad;
/**
 * Demonstriert die Verwendung von eigenen Listen, die den Typ kontrollieren
 * @author Alfa
 *
 */
public class ListenTest {

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Collection fahrraeder = new FahrradListe();
		fahrraeder.add(new Fahrrad());
		System.out.println(fahrraeder);
		fahrraeder.add("Pumucklrad");
		System.out.println(fahrraeder);
		fahrraeder.add(123);
		//Autoboxing!
		System.out.println("-------------------------------------------------------------");
		Collection namen = new StringListe();
		namen.add("Justus Jonas");
		namen.add(new Fahrrad());
		namen.add(123);
		System.out.println("--------------------------------------------------------------");
		Collection zahlen = new ZahlenListe();
		zahlen.add("Justus Jonas");
		zahlen.add(new Fahrrad());
		zahlen.add(123);
		
	}
}
