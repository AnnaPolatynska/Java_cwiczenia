package Sekwencje;

import java.util.ArrayList;

public class listy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//zaimportuj bibliotek�
		
		ArrayList<String> lista = new ArrayList<String>(); 
		lista.add("Ala"); //0indeks
		lista.add("Ola");
		lista.add("Ala");//2 indeks
		lista.add("Asia");
		
		System.out.println(lista.get(2)); //get przyjmuje indeks 
		
		System.out.println(lista);//wypisuje list� bez formatowania
		
		for(String s: lista){
			System.out.println(s +" ");
		}
		System.out.println("\n wielko�� listy: " + lista.size());
		
		lista.remove(1); //usuni�cie Oli
		System.out.println(lista);
		
		lista.remove("Ala"); //usunie Al� z 1 znalezionego miejsca indeksy si� przesuwaj�
		System.out.println(lista);
		
		lista.add(0, "Iza"); //wstawi iz� po oli
		System.out.println(lista);
		
		
		lista.set(0, "Ela"); //zamiana iz� 2 na El�
		System.out.println(lista);
	
		
		ArrayList<String> nowaLista = new ArrayList<String>(); 
		nowaLista.add("1"); 
		nowaLista.add("2"); 
		nowaLista.add("3"); 
		System.out.println("rozmiar:" +(nowaLista.size())); 
		System.out.println(nowaLista.get(1)); 
		nowaLista.remove("2"); 
		nowaLista.remove(1); 
		System.out.print(nowaLista); 
		
		
	}

}
