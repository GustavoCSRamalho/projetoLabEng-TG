/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Negao
 */
public class UsuarioDAOImplTeste {
    
    @Test
    public void conexaoFuncionaComOBancoSeLigaNegrao(){
        UsuarioDAO usuarioDAO = new UsuarioDAOimpl();
        assertNotNull(usuarioDAO.ler());
    }
}
