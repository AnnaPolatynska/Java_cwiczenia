package baza;


public class DBConnection {

	final static String connectionURL = "jbc:mysql://localhost:3306/skoczkowie";
	
	final static String name = "root2";
	final static String pass = "MySQL13";
	
	public static void main(String[] arg){
		//rejestracja klasy sterownika
		Class.forName(com.mysql.jdbc.Driver);
	

		
		
	}
	
	
	
	
	
	
	
	
	
}