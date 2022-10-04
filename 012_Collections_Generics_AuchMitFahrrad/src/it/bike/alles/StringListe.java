package it.bike.alles;

import java.util.ArrayList;

/**
 * Eine ArrayList, die nur Strings akzeptiert
 * @author Alfa
 *
 */
@SuppressWarnings({ "serial", "rawtypes" })
public class StringListe extends ArrayList{
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean add(Object zurPruefung) {
		if(zurPruefung instanceof String) {
			return super.add(zurPruefung);
		}else {
			System.err.println(zurPruefung.getClass().getName() + " ist kein String oder Erweitung von String");
			return false;
		}
		
	}
}
 