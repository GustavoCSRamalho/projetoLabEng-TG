package core.servico;

//import api.model.Admin;
import api.model.Pessoa;
import api.model.Usuario;
//import core.dao.AdminDaoBD;
import core.dao.UsuarioDaoBD;
import api.servico.LoginServico;

// CLASSE PARA VERIFICAÇÃO DE USUARIOS E ADMINS CADASTRADOS NO BANCO
public class LoginServicoImpl implements LoginServico {

    @Override
    public Pessoa findBynomeUsuario(String nomeUsuario) {
        
        UsuarioDaoBD userdaobd = null;
        //AdminDaoBD admdaobd = null;
        
        try{
            userdaobd = new UsuarioDaoBD();
            //admdaobd = new AdminDaoBD();
        
        }catch(Exception ex){
         System.out.println("Erro login do Usuario");
    }
        //metodos para pesquisar admins e usuarios cadastrados no banco
        Usuario usuarioBD = userdaobd.findByNomeUsuario(nomeUsuario);
        //Admin adminBD = admdaobd.findByNomeAdmin(nomeUsuario);
        
        if(usuarioBD != null){
            return usuarioBD;
        }
        /*else if(adminBD != null){
            return adminBD;
        }*/
        else
            return null;
    }
}
