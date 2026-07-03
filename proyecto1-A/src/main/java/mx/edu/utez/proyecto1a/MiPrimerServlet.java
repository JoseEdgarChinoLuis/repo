package mx.edu.utez.proyecto1a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.*;
import java.io.IOException;

@WebServlet(name = "miPrimerServlet", value = "/miServlet")
public class MiPrimerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hola mundo desde mi primer servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("name");
        String email = req.getParameter("email");

        if (nombre == null || nombre|.equals(""))

        System.out.println("Hola "+ nombre + " desde el metodo post");
        System.out.println("Tu correo es: " + email);
    }
}
