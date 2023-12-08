<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inicio</title>
</head>
<body>
<%@ page import="DAO.PaisDAO, Entidades.Aeropuerto" %>
<%@ page import="java.util.List, java.util.ArrayList" %>

    <h4>HAS INICIADO SESIÓN</h4>
    <div>
        <label>ORIGEN</label>
        <select class="form-origen">
            <%
                PaisDAO origin = new PaisDAO();
                List<Aeropuerto> aero = origin.obtenerAeropuertos();
  
                for (Aeropuerto aeropuerto : aero) {	
            %>
                <option value="<%= aeropuerto.getIdAeropuerto() %>">
               		 <%= aeropuerto.getPais()+"("+ aeropuerto.getCodigoIata() +")" %>
                </option>
            <%
               }
            %>
        </select>
        <label>DESTINO</label>
        <select class="form-origen">
            <%
                for (Aeropuerto aeropuerto : aero) {	
            %>
                <option value="<%= aeropuerto.getIdAeropuerto() %>">
               		 <%= aeropuerto.getPais()+"("+ aeropuerto.getCodigoIata() +")" %>
                </option>
            <%
               }
            %>
        </select>
    </div>
</body>
</html>