package DrugaPaczka;

//szyfrowanie danych
public class Szyfrowanietekstu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char letter1 = 'k'; 
		char letter2 = 'o'; 
		char letter3 = 't'; 
		System.out.println("B��dne \"sumowanie\" znak�w"); //zwraca liczb� z alfabetu aski dla liter k+o+t//
		System.out.println(letter1 + letter2 + letter3); 
		System.out.print("Tekst jawny: "); 
		System.out.println(" "+letter1 + letter2 + letter3); 
				 
		letter1++; //dodano po 1 cyferce co zaszyfrowa�o//
		letter2++; 
		letter3++; 
		System.out.print("Tekst zaszyfrowany: "); 
		System.out.println("" + letter1 + letter2 + letter3);
		
		letter1--; 
		letter2--; 
		letter3--;
		System.out.print("Tekst jawny ponownie: "); 
		System.out.println(" "+letter1 + letter2 + letter3); 
		
		
		int a= 5;
		double b= 5;
		int d= (int) b/a; //rzutuje double  na int//
		int c= (int)(a/b);
		float numer3 = 10.789f;
		
		double numer1=10.987;
		int numer2=5;
		int narrowing = (int) numer1;
		double widening = (double)numer2;
		System.out.println("Narrowing (zaw�a do ca�kowiej w d�): " + narrowing);
		System.out.println("widening (dostawia po przecinku): " + widening);
		long e = Math.round(numer3);
		System.out.println(e);
		
		
		//J11 podziel liczby float i wy�wietl jako int//
		float num1 = 10.789f;
		float num2 = 2.689f;
		
		int num3= (int)(num1/num2);
		System.out.println("liczba int: "+ num3);
		
	
		
	}

}
