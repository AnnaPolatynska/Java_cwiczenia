import java.util.Scanner;
import java.io.FilterInputStream;

public class testSkaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("wpisz imie: ");
		
		String imie;
		Scanner odczyt = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		//nie zamyka danych w strumieniu mo�na korzysta� z nich dalej//
		
		//in = strumie�, skaner uruchamia odczyt//
		imie= odczyt.nextLine();
		System.out.println("witaj "+ imie);
		odczyt.close();
		//zamkni�cie strumienia//
		
		Scanner odczyt2 = new Scanner(System.in);
		String imie2= odczyt2.nextLine();
		System.out.println("witaj2 "+ imie2);
		odczyt2.close();
		

	}

}
