import java.io.FilterInputStream;
import java.util.Random;
import java.util.Scanner;
//J28
/*Napisz program, kt�ry wypisze 5 losowych warto�ci typu int na ekran i stosuj�c instrukcje if-else dla 
 * ka�dej z tych warto�ci program sklasyfikuje warto�� jako (mniejsz�, r�wn� lub wi�ksz�) od zadanej warto�ci przez u�ytkownika. 
 LOSOWE
 */

public class J28_losowo {
	public static void main(String[] args ) {
			Scanner costam = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		System.out.println("Podaj 1 liczb�: ");
		double A = costam.nextDouble(); //nextDouble  czyta kolejn� liczb� zmiennoprzecinkow� //
		
	
		Random gen= new Random(); //cnt+shift+o �ci�ga bibliotek�//
		int X= gen.nextInt(3);
		boolean result;
	
		System.out.println(X);
		
		if( X > A) { 
			System.out.println("wi�ksza od A"); 	
		}
		else if(X <A) { 
				System.out.println("mniejsza od A "); 
			}
		
			else{
			System.out.println("r�wna A"); 
			}
		// pierwsze dzia�a //
		
		System.out.println("Podaj 2 liczb�: ");
		double B = costam.nextDouble(); //nextDouble  czyta kolejn� liczb� zmiennoprzecinkow� //
		int Y= gen.nextInt(3);
		System.out.println(Y);
		
		if( Y > B) { 
			System.out.println("wi�ksza od B"); 	
		}
			else if(Y <A) { 
				System.out.println("mniejsza od B "); 
			}
		
			else{
			System.out.println("r�wna B"); 
		
		
		
	}
	}
}
			

