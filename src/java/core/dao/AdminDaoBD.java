package core.dao;

import api.dao.AdminDao;
import api.model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDaoBD extends ConexaoBD implements AdminDao {
    
   //constructor chamado pela classe herdada
    public AdminDaoBD(){
        super();
    }
    
    //varivaies para comandos de sql
    private Connection conn = null;
    private Statement st = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    @Override
    public boolean insert(Admin admin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Admin findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Admin findByNomeAdmin(String nomeUsuario){
       
        Admin admin = null;

        try{
            //aqui executo o comando de pesquisa no banco com o preparedStatement
            this.pst = this.conn.prepareStatement("SELECT * FROM admin WHERE NOME = ?");

            //aqui armazeno o valor da variavel buscada no banco
            this.pst.setString(1, nomeUsuario);

            //aqui eu executo o comando de pesquisa no bando (sql)
            this.rs = this.pst.executeQuery();
            
            while (this.rs.next()) {
                admin = new Admin();
                admin.setIdAdmin(this.rs.getInt("id"));
                admin.setNome(this.rs.getString("nome"));
                admin.setSenha(this.rs.getString("senha"));
            }
            
            this.fechaBanco(conn, pst, rs);
            
        }
        catch(SQLException ex){
        System.out.print("\nErro de busca ao usuario!");
    }
        return admin;
    }
}
