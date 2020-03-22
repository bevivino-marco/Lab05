package it.polito.tdp.anaggrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.polito.tdp.anagrammi.model.Parola;


public class ParolaDAO {
	public boolean isCorrect(Parola p) {

		final String sql = "SELECT nome FROM parola WHERE nome=?";
        boolean result;
		

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(String.format(sql));
            st.setString(1, p.getNome());
			ResultSet rs = st.executeQuery();

			
			if (rs.next()) {
			
				result = true;
			}else result = false;

			conn.close();
			return result;
			

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
		
	
	}
	/*public String getParoleCorrette(Parola p ) {
		final String sql = "SELECT * FROM parola WHERE nome=?";
		String s="";
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(String.format(sql));
            st.setString(1, p.getNome());
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				s =rs.getString("nome");
			}

			conn.close();
			return s;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
		
	}*/
}
