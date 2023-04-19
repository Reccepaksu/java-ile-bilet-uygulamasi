package OtobusBilet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Baglanti {
	static String url = "jdbc:postgresql://localhost:5432/BiletOtomasyon";
	static Connection conn ;
	static Statement mystat;
	
	static void baglan () {
		try {
			conn=DriverManager.getConnection(url,"postgres","1234");
			//System.out.println("Baglantiniz gerçekleşti");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	
		static ResultSet sorgu(String sql_admin) {
			Statement st;
			ResultSet rs=null ;
			try {
				st= conn.createStatement(); 
				rs = st.executeQuery(sql_admin);
			} catch (Exception e) {
				// TODO: handle exception
			}
			return rs;
		}
		
		
}