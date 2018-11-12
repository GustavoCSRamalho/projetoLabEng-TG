package controller;

import api.model.Usuario;
import core.servico.CadastroUsuarioServico;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Cadastro", urlPatterns = {"/Cadastro"})
public class Cadastro extends HttpServlet {
    
    //instancias das classes de usuario e cadastroUsuarioServico
    CadastroUsuarioServico novo;
    Usuario u;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        novo = new CadastroUsuarioServico();
        u = new Usuario();
        
        //metodo que retorna todos os servlets
        ServletContext sc = request.getServletContext();
        
        //metodos para pegar os dados do formulario inseridos no front
        String nome = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        
        //atribuindo valores a variavel u e logo em seguida passando para a variavel
        //de cadastroUsuarioservico
        u.setNome(nome);
        u.setSenha(senha);
        
        boolean cadastro = novo.insert(u);
        
         if (cadastro == true){
            request.setAttribute("Cadastrado com sucesso", cadastro);
        }
        else{
            request.setAttribute("Erro ao cadaastrar",  cadastro);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ServletContext sc = request.getServletContext();
        
        sc.getRequestDispatcher("/jsp/Cadastro.jsp").forward(request, response);
    }
}