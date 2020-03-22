package it.polito.tdp.anaggrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.polito.tdp.anagrammi.model.Parola;


public class ParolaDAO {
	public boolean getParola(Parola p) {

		final String sql = "SELECT * FROM parola WHERE nome=?";

		

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(String.format(sql));
            st.setString(1, p.getNome());
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				conn.close();
				return true;
			}

			conn.close();
			return false;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
		
	
	}
}
