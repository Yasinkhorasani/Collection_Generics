package it.bike.alles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.band.bike.Fahrrad;


/**
 * Stellt Arrays und dynamische Arrays gegenüber
 * 
 * dynamische Arrays: Collection API
 * 	API: Klassen und Interfaces, die erlauben Sammlungen/Container DYMANISCH zu machen
 * 
 * Collection ist das Interface, das der API den Namen gegeben hat
 * Collection ist Elterninterface und wird von Interfaces erweitert, Hier: List, Set, (Map)
 * Anfangs Collection als Referenztyp, später/dauerhaft List/Set ... (Map)
 * 
 * ArrayList: Container: anfangs leer: size(): 0
 * 
 * remove: nutzt equals, um zu entscheiden, ob ein Element entfernt wird: Der Reihenfolge nach
 * wird erste Element entfernt, wenn das equals-Vergleich true liefert
 * 
 * @author Alfa
 *
 */
public class DynamoTest {

	/**
	 * Hier eine sehr untypisch grosse main-Methode
	 * Stellt die Syntax vor und enthält deshalb den gesamten Ablauf
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) {
		String[] sortenArray = {"Bananen","Äpfel","Kirschen","Birnen"};
		//Abkürzung für: String[] sortenArray = new String[4]; sortenArray[0] = "Bananen"; ....
		System.out.println(Arrays.deepToString(sortenArray));
//		for(String sorte:sortenArray) {
//			System.out.println(sorte);
//		}
//		sortenArray[4] = "Kiwi"; java.lang.ArrayIndexOutOfBoundsException
		
		Collection sortenSammlung = new ArrayList(); 
//		Collection sortenSammlung = new HashSet();
		
		sortenSammlung.add("Bananen");
		sortenSammlung.add("Äpfel");
		System.out.println(sortenSammlung);
		sortenSammlung.add("Kirschen");
		System.out.println(sortenSammlung);
		sortenSammlung.add("Kirschen");
		sortenSammlung.add("Birnen");
		sortenSammlung.add("Kiwis");
		System.out.println(sortenSammlung);
		
		System.out.println(sortenSammlung.getClass().getSimpleName() + "  " + sortenSammlung.add("Bananen"));
		System.out.println(sortenSammlung);
		
		sortenSammlung.remove(new String("Bananen"));
		System.out.println(sortenSammlung);
		
		Fahrrad erstesRad = new Fahrrad();
		Fahrrad zweitesRad = new Fahrrad();
		
		sortenSammlung.add(erstesRad);
		sortenSammlung.add("---Trennung---");
		sortenSammlung.add(zweitesRad);
		
		System.out.println(sortenSammlung);
		sortenSammlung.remove(new Fahrrad());
		System.out.println(sortenSammlung);
		sortenSammlung.add(123);
//		sortenArray[0] = new Fahrrad();
	}

}
