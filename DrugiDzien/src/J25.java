import java.io.FilterInputStream;
import java.util.Scanner;

public class J25 {
//J 25
	// Napisz program zliczaj�cy litery, znaki bia�e, cyfry wprowadzone z klawiatury. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner cosik = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
	/*
	System.out.println("Podaj tekst: ");
	String wyraz=rl.nextLine();
	System.out.println(a.lenth());
	rl.close();
	*/
		System.out.println("Podaj tekst: ");
		String odw = cosik.nextLine();
		StringBuffer nowyBufor = new StringBuffer(odw);// metoda StringBuffer
		System.out.println(nowyBufor.toString());// zwraca w postaci obiektu
		
		cosik.close();
			
		
		
		
		
	}

}
