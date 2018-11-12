package api.dao;

import api.model.Admin;

/*Esta interfae serve para aplicar os metodos que sera executados no banco de dados */
public interface AdminDao {
    
    public boolean insert(Admin admin);
    public Admin findById(Long id);
    public Admin findByNomeAdmin(String nomeAdmin);
}
