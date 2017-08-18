package J52;
/*J52
 * Napisz program, w kt�rym utworzysz dwie klasy: 
Employee - klasa, kt�ra b�dzie przedstawia�a pracownika dowolnej firmy. Podstawowe informacje o pracowniku jakie s� potrzebne pracodawcy 
to imi�, nazwisko, rok urodzenia, sta� pracy 

 Company - klasa, w kt�rej utworzysz 3 obiekty reprezentuj�ce pracownik�w, a nast�pnie 
wy�wietlisz informacj� o nich na ekranie 
 * */
import java.util.ArrayList;

public class Company {

	ArrayList<String> lista = new ArrayList<String>(); //obiekt
	Company(ArrayList<String> lista){
		this.lista = lista;
	}
	
	public void szefInfo(){ //wy�wietl pracownik�w = warto�ci employee s� wykorzystywane przez inny obiekt = metod� szefInfo
		for (String prac:lista){
			System.out.println(prac);
		}
	}
		
	public static void main(String[] args) {
		ArrayList<String> pracownicy = new ArrayList<String>();//tworz� list� pracownicy
		//ka�dy nowy pracownik odwo�uje si� do metody Employee = szefInfo skorzysta z tego
		Employee Pierwszy=new Employee("Jan", "Kowalski", "1985", 12);
		pracownicy.add(Pierwszy.info());
		Employee Drugi=new Employee("Anna", "Malinowska", "1973", 22);
		pracownicy.add(Drugi.info());
		Employee Trzeci=new Employee("Zygmunt", "Koz�owski", "1964", 35);
		pracownicy.add(Trzeci.info());
				
		//System.out.println(Pierwszy.info());
		//System.out.println(Drugi.info());
		//System.out.println(Trzeci.info());
		//wypisuje pracownik�w
		
		//z klasy company sprawdzenie ile jest obiekt�w -- zwraca str z danymi pracownik�w
		
	Company szef1 = new Company (pracownicy);
		szef1.szefInfo();
				
		
	}
}



