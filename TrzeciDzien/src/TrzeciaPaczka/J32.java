package TrzeciaPaczka;
import java.util.Scanner;
public class J32 {
//J32
	/*Napisz program kt�ry pobiera od u�ytkownika wiek i 
	 * wy�wietla napis �Mo�esz g�osowa�!� lub �Nie mo�esz g�osowa�!� 
	 * w zale�no�ci od jego wieku.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program sprawdzajacy czy mo�na g�osowa� w zale�no�ci od wpisanego wieku
		
		Scanner wiek = new Scanner(System.in);
		System.out.println("Podaj wiek: ");
		//String d = wiek.nextLine();
		//W=18 ewentualna zmienna do podstawienia je�eli wykorzytujemy j� cz�sciej
						
		if (wiek.nextInt()>=18){
			System.out.println("Mo�esz g�osowa�");
		}
		else{
			System.out.println("Nie mo�esz g�osowa�");
		}
		System.out.println("koniec komunikatu");
		
		wiek.close();
		
		
	}

}
