package Dziedziczenie;

public class Test {

	public static void main(String[] args) {
		Opony t1=new Opony("Zimowa", "Michelin", "M32", 18, 60, 155);
		System.out.println(t1.NR + " "+ t1.model + " "+t1.nazwa+ " "+ t1.seria);
		
		Wheel w1= new Wheel("Super Felga", "BBS", "BBS123", 18);
		System.out.println(w1.model + " "+ w1.nazwa + " "+w1.cale);

		CzesciSpaliny s1= new CzesciSpaliny ("kopciuch", "S", "123", true);
		System.out.println(s1.model + " "+ s1.nazwa + " "+ s1.stnd);
		
	}

}