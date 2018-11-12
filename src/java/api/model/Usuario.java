package api.model;

public class Usuario extends Pessoa {
    
    private long idUsuario;
    
    public long getIdUsuario(){
        return idUsuario;
    }
    
    public void setIdUsuario(long idUsuario){
        this.idUsuario = idUsuario;
    }    
}
