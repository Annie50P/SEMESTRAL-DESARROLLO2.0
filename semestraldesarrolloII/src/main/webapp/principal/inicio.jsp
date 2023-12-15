<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Reservar vuelo</title>
    <style>
         
    </style>
</head>
<body>
<%@ page import="DAO.PaisDAO, Entidades.Aeropuerto" %>
<%@ page import="java.util.List, java.util.ArrayList" %>

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
        
        <label>FECHA IDA</label><input type="date" name="fechaSalida" class="form-fecha-salida">
        
    </div>
</body>
</html>