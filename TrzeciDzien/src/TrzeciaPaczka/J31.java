package TrzeciaPaczka;
import java.util.Scanner;
//J31

/* U�ytkownik wprowadza dwie zmienne typu String. 
 * Nale�y wydoby� trzeci� od ko�ca liter� drugiego Stringa. 
 * Na podstawie tej litery dzielimy pierwszy String na cz�ci. 
  */


public class J31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner rl = new Scanner(System.in);
			System.out.print("Podaj ci�g znak�w : ");
			String d = rl.nextLine();
			System.out.print("Podaj drugi ci�g znak�w : ");
			String g  = rl.nextLine();
			System.out.println("d�ugo�� wyrazu minus 3 to: "+ (g.length()-3));
			// 2 spos�b wydobycia 3 od ko�ca
			// System.out.println(g.charAt(g.length()-3));
			
			
			String o = String.valueOf(g.charAt(g.length()-3));
			System.out.println(o);
			
			for(String i : d.split(o)){
				System.out.println(i);
			}
			rl.close();
		// wypisuje jedynie po sobie nie podstawia ? wz�r M
		
		
	
		
		
		
		}

		
	
	}

