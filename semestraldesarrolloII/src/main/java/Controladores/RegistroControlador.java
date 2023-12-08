package Controladores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LoginDAO;
import Entidades.Usuario;

@WebServlet("/RegistroControlador")
public class RegistroControlador extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter();
             BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"))) {

            Usuario user = new Usuario();
            LoginDAO lg = new LoginDAO();
            int rspta = 0;

            String jsonString = reader.readLine(); 
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
                    response.sendRedirect("/semestraldesarrolloII/index.jsp");
                } else {
                    response.sendRedirect("/semestraldesarrolloII/index.jsp?rspta=" + rspta);
                }
            } else {
                response.sendError(rspta);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
