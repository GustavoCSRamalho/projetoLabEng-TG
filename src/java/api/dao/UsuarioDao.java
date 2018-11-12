package api.dao;

import api.model.Usuario;

/*Esta interfae serve para aplicar os metodos que sera executados no banco de dados */
public interface UsuarioDao {
    
    public boolean insert(Usuario usuario);
    public Usuario findById(Long id);
    public Usuario findByNomeUsuario(String nomeUsuario);
    
}
