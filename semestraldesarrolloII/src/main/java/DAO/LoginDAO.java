package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import BD.Conexion;
import Entidades.Usuario;

public class LoginDAO {
	
	Conexion cn = new Conexion();
	
	public LoginDAO() {}
	
	public int validarLogin(Usuario usr) throws Exception {
		int rspta = 0;
		
		PreparedStatement ps= cn.conectar().prepareStatement("SELECT 1 as existe"
											   + " FROM usuarios "
											   + " WHERE email=? and contraseña=? ;");
	    ps.setString(1,usr.getEmail());
	    ps.setString(2, usr.getPass());
	    
	    ResultSet rs = ps.executeQuery();
	    if(rs.next()){
	    	rspta = rs.getInt("existe");
	    }
	    
	    return rspta;
	}
	public int registrarUsuario(Usuario usuario) throws Exception {
        int respuesta = 0;

            try (PreparedStatement ps = cn.conectar().prepareStatement(
                    "INSERT INTO usuarios (nombre, apellido, email, contraseña, fecha_nacimiento, pais, cedula) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)")) {

                ps.setString(1, usuario.getNombre());
                ps.setString(2, usuario.getApellido());
                ps.setString(3, usuario.getEmail());
                ps.setString(4, usuario.getPass());
                ps.setString(5, usuario.getFechaNac());
                ps.setString(6, usuario.getPais());
                ps.setString(7, usuario.getCedula());

                respuesta = ps.executeUpdate();
                if (respuesta > 0) {
                    System.out.println("Registro exitoso");
                } else {
                    System.out.println("No se pudo insertar el registro");
                }
            } catch (Exception ex) {
                System.out.println("ERROR AL EJECUTAR QUERY: " + ex);
                throw ex;
            }
        
        return respuesta;
    }
    
}
	

	
	

