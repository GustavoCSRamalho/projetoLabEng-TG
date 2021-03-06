package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PaginaAdm", urlPatterns = {"/PaginaAdm"})
public class PaginaAdm extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext sc = request.getServletContext();
        
        try{
            sc.getRequestDispatcher("jsp/PaginaAdm.jsp").forward(request, response);
            
        }catch (Exception erro) {
            System.out.println("Erro ao abrir a pagina");
    }
    }
}