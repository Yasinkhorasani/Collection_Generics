package it.bike.alles;

import java.util.ArrayList;

import com.band.bike.Fahrrad;
/**
 * Die Fahrrad-Liste ist eine ArrayList mit überschriebener add-Methode:
 * Es soll nicht mögich sein, andere Elemente zuzufügen, als Fahrräder
 * @author Alfa
 *
 */
@SuppressWarnings({ "serial", "rawtypes" })
public class FahrradListe extends ArrayList{

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(Object zurPruefung) {
		if(zurPruefung instanceof Fahrrad) {
			return super.add(zurPruefung);
		} else {
			System.err.println(zurPruefung.getClass().getName() + " ist kein Fahrrad oder Erweiterung von Fahrrad");
			//Alternativ: System.exit(-1);
			return false;
		}
		
	
	}
}
  