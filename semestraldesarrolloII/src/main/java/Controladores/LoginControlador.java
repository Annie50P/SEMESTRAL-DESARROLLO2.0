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

@WebServlet("/LoginControlador")
public class LoginControlador extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter();
             BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"))) {

            Usuario user = new Usuario();
            LoginDAO lg = new LoginDAO();
            int rspta = 0;

            String jsonString = reader.readLine();

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
                    response.sendRedirect("/semestraldesarrolloII/inicio.jsp");
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

