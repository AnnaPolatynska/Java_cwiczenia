package Tablice;

import java.io.FilterInputStream;
import java.util.Random;
import java.util.Scanner;
//J46
/*Napisz program, kt�ry wczytuje od u�ytkownika liczb� ca�kowit�, a nast�pnie wy�wietla jej reprezentacj� w kodzie binarnym (ZM). 
 * Podczas konwersji liczby nale�y kolejne jej bity zapisywa� w pomocniczej tablicy liczb ca�k. o rozmiarze 32. 
 * Konwersji nale�y dokona� korzystaj�c z operacji dzielenia ca�kowitego oraz operacji modulo. 
177 */
/*public class J46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		// 1 wersja d�u�sza------------------------------------------------------------sprawdzi�
		
		
		Scanner costam = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		//sprawdzamy czy liczba%2: 
		//a) =0 zostaje bez reszty (podzielna przez 2)
		//b) =1 zostaje z reszt� liczba-1 liczba/2 ???
		
		
		System.out.println("Podaj 1 liczb� do przekszta�cenia na kod binarny: ");
		int liczba = costam.nextInt(); // nextDouble  czyta kolejn� liczb� zmiennoprzecinkow� //
		int licznik = 0;
		costam.nextLine();
				
		int[] tabl = new int[32]; //tablica 32 bit
		//generowanie
		
		do{
			if(liczba%2 ==0){
			liczba/=2;
			tabl[licznik++]=0;
		}else{
				liczba = liczba/2; //liczba/=2
				tabl[licznik++] = 1;
				}
		while(liczba>0);
		System.out.println( "tw�j kod binarny: " );
		for(int i = tabl.length-1; i>=0 ; i-- ){
		//	}if (licznik >= i){
			//System.out.println( tabl[i]);
		
		//}else{
			//System.out.println( 0);
	//}
		
		
		//costam.close();
		
		// 2 wersja kr           ---------------------------------------------------uzupe�ni�
		
		/*System.out.println("Podaj 1 liczb� do przekszta�cenia na kod binarny: ");
		
		
		int liczba = costam.nextInt(); // nextDouble  czyta kolejn� liczb� zmiennoprzecinkow� //
		int licznik = 0;
		costam.nextLine();
				
		int[] tabl = new int[32]; //tablica 32 bit
		//generowanie
	
		
		
		
		
		
		}
	}
*/
//}
