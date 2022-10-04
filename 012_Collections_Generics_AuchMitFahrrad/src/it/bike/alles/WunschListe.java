package it.bike.alles;

import java.util.ArrayList;

/**
 * Wünschen eines Typs in einer Liste
 * @author Alfa
 *
 */
@SuppressWarnings({ "serial", "rawtypes" })
public class WunschListe extends ArrayList{
	
	private Class typ;
	
	public WunschListe(Class typ) {
		this.typ = typ;
	}
	
//	@SuppressWarnings("unchecked")
//	@Override
//	public boolean add(Object zurPruefung) {
//		if(zurPruefung instanceof typ.getC) {
//			return super.add(zurPruefung);
//		}else {
//			System.err.println(zurPruefung.getClass().getName() + " ist kein Integer oder Erweitung von Integer");
//			return false;
//		}
//		
//	}
}
