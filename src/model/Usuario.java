package model;

public class Usuario {
    private String correoUsuario;
    private String contra;
    
    public Usuario(String _correoUsuario, String _contra){
        this.correoUsuario = _correoUsuario;
        this.contra = _contra;
    }

    public String getUsuario() {
        return this.correoUsuario;
    }

    public void setUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContra() {
        return this.contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
