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

       if (request.getParameter("btn-enviar") != null) {
           String email = request.getParameter("email");
           String pass = request.getParameter("pass");
           user.setEmail(email);
           user.setPass(pass);

           try {
               rspta = lg.validarLogin(user);
           } catch (Exception ex) {
               System.out.println("ERROR AL EJECUTAR QUERY" + ex);
           }

           if (rspta != 0) {
               response.sendRedirect("../principal/decide.jsp");
           } else {
               response.sendRedirect("../index.jsp?rspta=" + rspta);
           }
       } else {
           response.sendError(rspta);
       }
%>