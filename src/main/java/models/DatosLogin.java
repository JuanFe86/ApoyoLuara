package models;

public class DatosLogin {

    private String usuario;
    private String contraseña;

    public DatosLogin(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
}
