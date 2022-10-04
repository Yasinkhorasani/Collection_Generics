package it.bike.alles;

import java.util.ArrayList;

/**
 * Eine ArrayList, die nur Integer/int akzeptiert
 * @author Alfa
 *
 */
@SuppressWarnings({ "serial", "rawtypes" })
public class ZahlenListe extends ArrayList{
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean add(Object zurPruefung) {
		if(zurPruefung instanceof Integer) {
			return super.add(zurPruefung);
		}else {
			System.err.println(zurPruefung.getClass().getName() + " ist kein Integer oder Erweitung von Integer");
			return false;
		}
		
	}
}