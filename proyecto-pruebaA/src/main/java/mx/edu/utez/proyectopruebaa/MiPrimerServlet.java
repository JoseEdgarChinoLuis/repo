package mx.edu.utez.proyectopruebaa;
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

        //if (nombre == null || nombre|.equals(""))//

        Persona persona = new Persona(
                nombre,
                email
        );

        //guardar los datos en una maleta para llevarlos a la interfaz con una clave
        req.setAttribute("persona", persona);

        //rediraccionar a la ventana
        req.getRequestDispatcher("/WEB-INF/views/mostrarInfo.jsp").forward(req,resp);
    }
}
