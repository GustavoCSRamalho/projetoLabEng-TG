package api.servico;

import api.model.Pessoa;

//interface SERVICE para aplicar o metodo de login
public interface LoginServico {
    public Pessoa findBynomeUsuario(String nomeUsuario);
    
}
