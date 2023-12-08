package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BD.Conexion;
import Entidades.Aeropuerto;

public class PaisDAO {
	
	Conexion cn = new Conexion();
	
	public PaisDAO() {}
	public List<Aeropuerto> obtenerAeropuertos() throws SQLException {
	    List<Aeropuerto> aeropuertos = new ArrayList<>();

	    try (PreparedStatement ps = cn.conectar().prepareStatement("SELECT id_aeropuerto, pais, codigo_iata FROM aeropuerto")) {
	    	
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Aeropuerto aeropuerto = new Aeropuerto();
	            aeropuerto.setIdAeropuerto(rs.getInt("id_aeropuerto"));
	            aeropuerto.setPais(rs.getString("pais"));
	            aeropuerto.setCodigoIata(rs.getString("codigo_iata"));
	            aeropuertos.add(aeropuerto);
	        }
	    }

	    return aeropuertos;
	}
}

