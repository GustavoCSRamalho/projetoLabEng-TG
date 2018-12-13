package controller;

//import api.model.Admin;
import api.model.Pessoa;
import api.model.Usuario;
import core.servico.LoginServicoImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Index", urlPatterns = {"/index"})
public class Index extends HttpServlet{
    
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    //protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            
        //metodo que retorna todos os servlets
        ServletContext sc = request.getServletContext();
        
        //metodos para pegar dados inseridos no front pelos usuarios
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        
        //instancia da classe "login servico implementação" para verificar usuarios cadastrados
        LoginServicoImpl loginservicopimpl = new LoginServicoImpl();
        
        //metodo para pesquisar o usuario no banco de dados
        Pessoa p = loginservicopimpl.findBynomeUsuario(usuario);
        
        //condição para verificar caso o nome nao seja nulo e a senha seja a mesma inserida pelo usuario
        if(p != null && p.getSenha().equals(senha)){
            //condição para verificar se é um usuario inserido
            if(p instanceof Usuario){
                sc.getRequestDispatcher("/jsp/pergunta.jsp").forward(request, response);
                RequestDispatcher view = request.getRequestDispatcher("/jsp/pergunta.jsp");

                //response.sendRedirect("http://localhost:8080/pergunta.jsp");
            }
            //condição para verificar se é um admin inserido
           /* else if(p instanceof Admin){
                sc.getRequestDispatcher("jsp/paginaAdm.jsp");
            }*/
        }
        else{
            request.setAttribute("Usuario ou admin nao cadastrado", true);
            sc.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
        }
    }
 }