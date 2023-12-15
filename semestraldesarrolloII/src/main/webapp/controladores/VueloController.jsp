<%@ page import= "java.io.IOException,
java.sql.SQLException,
java.util.List, java.util.ArrayList"
%>
<%@ page import= "DAO.PaisDAO,
 Entidades.Aeropuerto, Entidades.Vuelo"
%>
<%
        Aeropuerto aer = new Aeropuerto();
        PaisDAO pa = new PaisDAO();

        List<Aeropuerto> aeropuertos = pa.obtenerAeropuertos();
        request.setAttribute("aeropuertos", aeropuertos);
        
        
        Aeropuerto origenSeleccionado = (Aeropuerto) request.getAttribute("origenSeleccionado");
        Aeropuerto destinoSeleccionado = (Aeropuerto) request.getAttribute("destinoSeleccionado");
        
        if ("btn-enviar".equals(request.getParameter("action"))) {
            String pais = request.getParameter("pais");
            String codigoIata = request.getParameter("codigoIata");
            aer.setPais(pais);
            aer.setCodigoIata(codigoIata);
          
             try {
                aeropuertos = pa.obtenerAeropuertos();
                request.setAttribute("aeropuertos", aeropuertos);
            } catch (Exception ex) {
                System.out.println("ERROR AL EJECUTAR QUERY" + ex);
            }

            if (aeropuertos != null && !aeropuertos.isEmpty()) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/semestraldesarrolloII/inicio.jsp");
                dispatcher.forward(request, response);
                
            } else {
                response.sendRedirect("/semestraldesarrolloII/index.jsp?rspta=0"+aeropuertos);
            }
        }
%>