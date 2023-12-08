package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Conexion {
	
	public static Connection conectar() {
		Connection conn= null;
		String driver="com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
			System.out.println("Driver cargado con éxito");
			try {
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/semestral?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Patricia05**");
				if(conn!=null) {
					System.out.println("Conexión realizada con éxito");
					return conn;
			   }
			}catch(SQLException e) {
				System.out.println("Ha ocurrido un error al intentar conectar con la base de datos"+e.getMessage());
			}
		}catch(Exception e) {
			System.out.println("Ha ocurrido un error al cargar el Driver"+e.getMessage());
		}
		return conn;
	}
}
