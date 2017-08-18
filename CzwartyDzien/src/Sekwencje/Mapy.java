package Sekwencje;

import java.util.HashMap;

public class Mapy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//mapy
		
		//new HashMap< TypKlucza, TypWarto�ci >(); //wszystkie klucze tego samego typu unikatowe
		HashMap< Integer, String> mapa = new HashMap < Integer, String>(); 
		mapa.put(10, "Dziesi�c");
		mapa.put(12, "dwana�cie");
		mapa.put(20, "Dwadzie�cia");
		mapa.put(9, "Dziewi�c");
		
		System.out.println(mapa.get(10));
		
		System.out.println(mapa.get(1));//nie istnieje klucz dostaj� null
		System.out.println(mapa.keySet()); //dost�pne klucze
		System.out.println(mapa.values());//dost�pne warto�ci
		mapa.remove(10, "Dziesie�"); //je�eli 10 klucz ma warto�c "Dziesie�" to usunie
		
		System.out.println(mapa); //wypisuje
		mapa.clear(); 
		System.out.println(mapa.size()); 
		
		
		HashMap<Integer,Double> nowaMapa = new HashMap<Integer,Double>();  
		nowaMapa.put(2, 3.5); 
		nowaMapa.put(1, 4.7); 
		nowaMapa.put(3, 5.7); 
		System.out.println(nowaMapa.get(2)); 
		nowaMapa.remove(3); 
		System.out.println(nowaMapa.isEmpty()); 
		System.out.println(nowaMapa.size()); 
		System.out.println(nowaMapa.keySet()); 
		System.out.println(nowaMapa.values()); 
		
	}

}
