import java.io.Serializable;

public class Contacto implements Serializable {

    private String nombre;
    private int telefono;
    private String correo;

    public Contacto(String nombre, int telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
     
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

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                '}';
    }
}
