package Tablice;

public class tablice1 {
	public static void main(String[] args) {
		//tablice mog� mie� jedynie ten sam typ danych
		int[][] tab = new int[3][3]; 
		tab[0][0]=1;
		tab[0][1]=2;
		
		//od razu przypisuj� warto�ci
		int[][] tab2 = { 
				{9,2,3,4,5,6},
				{8,5,6,6,7,8},
				{4,8,9,2,3,6} }; 
		
		/*for(int i=0; i<=tab2.length -1; i++){
			for(int j=0; j<= tab2.length -1 ; j++){
				System.out.print(tab2[i][j]); //pokazuje w wierszach
				//System.out.println(tab2[i][j]); //pokazuje w ci�gu
			}
			System.out.println("");//pokazuje w wierszach
		*/
		System.out.println("d�ugo�� pierwszego wymiaru= wiersze: "+ tab2.length);// d�ugo�� pierwszego wymiaru 
		System.out.println("d�ugo�� drugiego wymiaru= kolumny: "+ tab2[1].length);// d�ugo�� drugiego wymiaru  
		
						
		int[][]tablica = { {9,2,3,4,5,6,8}, {8,5,6,6,7,8,1}, {4,8,9,2,3,6,3}, {7,8,9,2,3,4,7} }; 
		
		for(int k=0; k< tablica.length -1; k++){ 
		    for(int p=0; p< tablica[k].length-1; p++) 
		        System.out.print(tablica[k][p]); // warto�ci
		    
		} 
		 
		System.out.println("\nd�ugo�� pierwszego wymiaru= wiersze: "+ tablica.length); 
	    System.out.println("d�ugo�� drugiego wymiaru= kolumny: "+ tablica[1].length);
		
		
		
		
		System.out.println("-------------------------------------");
			
			
		
		
		System.out.println(tab2[0][0]);
		System.out.println(tab2[0][1]);
		System.out.println(tab2[1][0]);
		
		//tablica 3 wymiarowa -kostka mo�e mie� 2na 3 na 2 mo�e nie by� kwadratowa
		//nazwa mo�e by� przed lub po []
		
		String tab3[][][]  = {
				{{"a1", "a2"}, //1 plaster
				{"a3", "a4"}},
				
				{{"b1", "b2"}, //2 plaster
				{"b3", "b4"}}
				};
		
		System.out.println(tab3[1][0][1]); //kol 2 wiersz 1 plaster 2 = b2
		
		

		
		
		
		
	}
}
