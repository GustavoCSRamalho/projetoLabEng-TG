package core.servico;

import api.model.Usuario;
import api.servico.UsuarioServico;
import core.dao.UsuarioDaoBD;
import java.util.logging.Level;
import java.util.logging.Logger;

//CLASSE SERVICO PARA CADASTRO DE USUARIO
public class CadastroUsuarioServico implements UsuarioServico {

    @Override
    public boolean insert(Usuario usuario) {
        
        UsuarioDaoBD user = null;
        
        try{
            //cria uma nova variavel para um novo usuario que sera retornado do metodo para cadastro
            user = new UsuarioDaoBD();
        }catch (Exception ex) {
            Logger.getLogger(CadastroUsuarioServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        //retorna o cadastro de usuario na classe usuarioDaoBD
        return user.insert(usuario);
    }
}