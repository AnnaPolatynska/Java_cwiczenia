package J52;
/*J52
 * Napisz program, w kt�rym utworzysz dwie klasy: 
Employee - klasa, kt�ra b�dzie przedstawia�a pracownika dowolnej firmy. Podstawowe informacje o pracowniku jakie s� potrzebne pracodawcy 
to imi�, nazwisko, rok urodzenia, sta� pracy 

 Company - klasa, w kt�rej utworzysz 3 obiekty reprezentuj�ce pracownik�w, a nast�pnie 
wy�wietlisz informacj� o nich na ekranie 
 * */
public class Employee {
	
	String nazwisko;//kolejno�� nie ma znaczenia
	String rokUrodzenia;
	String imie;
	int stazPracy;
	
	Employee(String imie, String nazwisko, String rokUrodzenia, int stazPracy)	{// kolejno�� ma znaczenie
			this.imie= imie;//kolejno�� nie ma znaczenia
				this.stazPracy=stazPracy;
				this.nazwisko= nazwisko;
				this.rokUrodzenia=rokUrodzenia;
			}
	
	public String info(){
		return "Pracownik: "+imie+ " " + nazwisko+ " "+ rokUrodzenia+ " sta� pracy: "+ stazPracy;
	}
	
	
	
	
	
	
}
