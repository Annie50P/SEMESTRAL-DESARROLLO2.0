<%@ page import= "java.io.IOException,
java.sql.SQLException,
java.util.List" 
%>
<%@ page import= "DAO.LoginDAO,
 Entidades.Aeropuerto,
 Entidades.Usuario" 
%>
<%
	Usuario user = new Usuario();
	LoginDAO lg = new LoginDAO();
	int rspta = 0;
	  
	if (request.getParameter("btn-registrar") != null) {
	    String nombre = request.getParameter("nombre");
	    String apellido = request.getParameter("apellido");
	    String email = request.getParameter("email");
	    String contrasena = request.getParameter("pass");
	    String fechaNacimiento = request.getParameter("fechaNacimiento");
	    String pais = request.getParameter("pais");
	    String cedula = request.getParameter("cedula");
	
	    user.setNombre(nombre);
	    user.setApellido(apellido);
	    user.setEmail(email);
	    user.setPass(contrasena);
	    user.setFechaNac(fechaNacimiento);
	    user.setPais(pais);
	    user.setCedula(cedula);
	
	    try {
	        rspta = lg.registrarUsuario(user);
	    } catch (Exception ex) {
	        System.out.println("ERROR AL EJECUTAR QUERY: " + ex);
	    }
	
	    if (rspta != 0) {
	        response.sendRedirect("../index.jsp");
	    } else {
	        response.sendRedirect("../principal/registro.jsp");
	    }
	} else {
	    response.sendError(rspta);
	}
%>