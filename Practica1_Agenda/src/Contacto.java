import java.io.Serializable;

public class Contacto implements Serializable {

    private String nombre;
    private int telefono;
    private String correo;
    private boolean borrado; //Para poder eliminar un contacto creado pero que se puede recuperar

    public Contacto(String nombre, int telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.borrado = false;
     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    

    public void mostrarAgenda() {
        String estado = borrado ? "Borrado" : "Activo";
        System.out.println( "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                '}');
    }
}
