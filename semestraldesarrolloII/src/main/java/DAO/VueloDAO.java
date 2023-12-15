package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import BD.Conexion;
import Entidades.Vuelo;

public class VueloDAO {
Conexion cn = new Conexion();
	
	public VueloDAO() {}
	public void guardarVuelo(Vuelo vuelo) throws SQLException {
	
		try (PreparedStatement ps = cn.conectar().prepareStatement(
	    		"INSERT INTO vuelo (idTarifa, idOrigen, idDestino, fechaLlegada, fechaSalida) VALUES (?, ?, ?, ?, ?)")) {
	        ps.setInt(1, vuelo.getIdTarifa());
	        ps.setInt(2, vuelo.getIdOrigen());
	        ps.setInt(3, vuelo.getIdDestino());
	        ps.setString(4, vuelo.getFechaLlegada());
	        ps.setString(5, vuelo.getFechaSalida());

	
	        ps.executeUpdate();
	    }
	}
}
