package J54Przeciazanie;

/*public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operacje o1= new Operacje();
		System.out.println(o1.dodaj(2,3));
		System.out.println(o1.dodaj(2,3,4));
		System.out.println(o1.dodaj(2.23,3.65));
		System.out.println(o1.dodaj(2.24,3.32,3.21));
		
		
		Operacje o2=new Operacje();
		System.out.println(o2.odejmij(2,3));
		System.out.println(o2.odejmij(2,3,4));
		System.out.println(o2.odejmij(2.23,3.65));
		System.out.println(o2.odejmij(2.24,3.32,3.21));
		*/
//-----------------------------------------------------------------------wz�r		
		
		public class Test {
			public static void main(String[] args) {
				Operacje o1 = new Operacje();
				System.out.println(o1.dodaj(2,3));
				System.out.println(o1.dodaj(2,3,4));
				System.out.println(o1.dodaj(2.23,3.32));
				System.out.println(o1.dodaj(2.24,3.32,3.21));
				
				System.out.println(o1.odejmij(2,3));
				System.out.println(o1.odejmij(2,3,4));
				System.out.println(o1.odejmij(2.23,3.32));
				System.out.println(o1.odejmij(2.24,3.32,3.21));
				
				o1.printType(o1.dodaj(2,3));
				o1.printType(o1.dodaj(2.23,3.32));
				o1.printType(o1.odejmij(2.23,3.32));
				o1.printType(o1.odejmij(2.24,3.32,3.21));
		
		
		
	}

}
