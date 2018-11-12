package core.dao;

import api.dao.UsuarioDao;
import api.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDaoBD extends ConexaoBD implements UsuarioDao {
    
    //constructor chamado pela classe herdada
    public UsuarioDaoBD(){
        super();
    }
    
    //varivaies para comandos de sql
    protected Connection conn = null;
    protected Statement st = null;
    protected PreparedStatement pst = null;
    protected ResultSet rs = null;
     

    //metodo para inserir os usuarios no banco
    @Override
    public boolean insert(Usuario usuario) {
        
        boolean cadastro;
        
         ConexaoBD conexaoBD = new ConexaoBD();
         conexaoBD.conectandoBanco();
         
         PreparedStatement sql;
         
         try{
             /*Aqui passo o objeto "conn" e atribuo ao meu objeto sql o que permitira inserir comandos do BD
             em sql
             */


// TAH ERRADO AKI
             sql = this.conn.prepareStatement(""
                     + "INSERT INTO usuario("
                     + "nome,"
                     + "senha,"
                     + "VALUES(?,?);");
             
             sql.setString(1, usuario.getNome());
             sql.setString(2, usuario.getSenha());
             sql.executeQuery();
             cadastro = true;
                                  
        }catch (SQLException e) {
            System.out.println("Erro no insert CadastroCliente");
            cadastro = false;
    }
         return false;
}       
    
    @Override
    public Usuario findByNomeUsuario(String nomeUsuario) {
        
         Usuario usuario = null;
        
        try{
            //aqui executo o comando de pesquisa no banco com o preparedStatement
            this.pst = this.conn.prepareStatement("SELECT * FROM usuario WHERE nome = ?");
            
            //aqui armazeno o valor da variavel buscada no banco
            this.pst.setString(1, nomeUsuario);
            
            //aqui eu executo o comando de pesquisa no bando (sql)
            this.rs = this.pst.executeQuery();
            
            //laço para fazer a busca de usuario no banco de dados de acordo com os parametros inseridos
            while(this.rs.next()){
                usuario.setIdUsuario(this.rs.getInt("id"));
                usuario.setNome(this.rs.getString("nome"));
                usuario.setSenha(this.rs.getString("Senha"));
            }
            
            this.fechaBanco(conn, pst, rs);
            
        }
        catch(SQLException ex){
            System.out.print("\nErro de busca ao usuario!");
        }
        return usuario;
    }
    
     @Override
    public Usuario findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}