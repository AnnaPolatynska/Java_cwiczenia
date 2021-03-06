package db;
import java.io.FilterInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
public class connection {

		Connection con;
		Statement stmt;
		
		public void polaczenie() throws ClassNotFoundException, SQLException{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skoczkowie","root","miki123");
			System.out.println("Połączenie ustanowione!");
		}
		
		public void wypisz() throws SQLException{
			stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from zawodnicy");
			while(rs.next()){
			System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3)+ " " + rs.getString(4));
			}
		}
		public void wpisz(String columns, String values) throws SQLException{
			con.setAutoCommit(true);
			stmt.executeUpdate("insert into zawodnicy ( " + columns + " )" + " values ( " + values + " )");
		}
		public void zamknij() throws SQLException{
			con.close();
		}
		public static void main(String[] args) throws ClassNotFoundException, SQLException{
			connection bo = new connection();
			bo.polaczenie();
			bo.wypisz();
			bo.wpisz("id_skoczka,imie,nazwisko","30,'Miki','Kru'");
			bo.wypisz();
			bo.zamknij();
			
	}
}
