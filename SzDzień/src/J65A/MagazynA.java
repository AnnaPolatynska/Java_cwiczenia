package J65A;
import java.util.ArrayList;
import java.util.Scanner;
//------------------------------------------------------------------------------poprawione ok
public class MagazynA {
	private String nazwa; 
	private int cena;
	private int ilosc;
	public int id = 1;
	public ArrayList<MagazynA> produkty = new ArrayList<MagazynA>();
	Scanner sc = new Scanner(System.in);
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public int getIlosc() {
		return ilosc;
	}
	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
	public void zmienStan(){
		sc.nextLine();
		System.out.println("Podaj id produktu: ");
		id = sc.nextInt();
		System.out.println("Zmien ilo��: ");
		produkty.get(id-1).setIlosc(sc.nextInt());
	}
	
	public void dodajProdukt(MagazynA m1){
		sc.nextLine();
		System.out.println("Podaj nazw�: ");
		m1.setNazwa(sc.nextLine());
		System.out.println("Podaj cen�: ");
		m1.setCena(sc.nextInt());
		System.out.println("Podaj ilo��: ");
		m1.setIlosc(sc.nextInt());
		produkty.add(m1);
	}
	public void usunProdukt(MagazynA m1){
		System.out.println("Podaj id produktu do usuni�cia: ");
		id = sc.nextInt();
		produkty.remove(id-1);
		System.out.println("Produkt usuni�to!");
	}
	public void stanyProdukty(){
		for(MagazynA m1 : produkty){
		System.out.println("Nazwa: " + m1.getId());
		System.out.println("Nazwa: " + m1.getNazwa());
		System.out.println("Cena: " + m1.getCena());
		System.out.println("Ilosc: " +m1.getIlosc());
		System.out.println("==============================");
		}
	}
}

