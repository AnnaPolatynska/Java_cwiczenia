package J71;
/*Stw�rz klas� KontoBankowe kt�ra b�dzie reprezentowa�a wirtualn� reprezentacje konta bankowego. Przynajmniej nrKonta i saldo; 
 * W klasie konto bankowe stw�rz metody addSaldo, subbSaldo oraz przynajmniej dwie metody abstrakcyjne: interest, addDebit  
 * Nast�pnie stw�rz klas� KontoBank1 i KontoBank2 kt�ra b�dzie rozszerza� klas� KontoBankowe.  
 * Zaimplementuj wszystkie abstrakcyjne metody. 
 *  Przetestuj dzia�anie kont bankowych, dane maj� by� wprowadzanie przez u�ytkownika.  
*/
public class KontoParibas extends KontoBankowe{

		@Override
		void intrest(int nrKonta, float saldo) {
			System.out.println("Dane rachunku: \n nr rachunku: "+nrKonta+"\nsaldo: "+saldo);
			
		}
		@Override
		void addDebit() {
			System.out.println("Nie uznajemy kont debetowych");
			
		}

	}

