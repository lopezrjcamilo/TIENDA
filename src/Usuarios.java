public class Usuarios {

    private String cedula_usuario;
    private String email_usuario;
    private String nombre_usuario;
    private String password_usuario;
    private String usuario;

    /*constructor*/

    public Usuarios(String cedula_usuario, String email_usuario, String nombre_usuario, String password_usuario, String usuario) {
        this.cedula_usuario = cedula_usuario;
        this.email_usuario = email_usuario;
        this.nombre_usuario = nombre_usuario;
        this.password_usuario = password_usuario;
        this.usuario = usuario;
    }

    public Usuarios() {
    }

    public String getCedula_usuario() {
        return cedula_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getPassword_usuario() {
        return password_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setCedula_usuario(String cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "\n cedula_usuario= " + cedula_usuario +
                "\n email_usuario= " + email_usuario +
                "\n nombre_usuario= " + nombre_usuario +
                "\n password_usuario= " + password_usuario +
                "\n usuario= " + usuario +
                '}';
    }
}
