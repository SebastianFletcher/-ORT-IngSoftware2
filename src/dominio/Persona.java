package dominio;

import java.io.Serializable;
import javax.swing.ImageIcon;

public abstract class Persona implements Serializable {

    private static final String NULL_APELLIDO = "Apellido no ingresado";
    private static final String NULL_NOMBRE = "Nombre no ingresado";
    
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private ImageIcon fotoDePerfil;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String unApellido) {
        if (unApellido == null || unApellido.isEmpty()) {
            this.apellido = NULL_APELLIDO;
        } else {
            this.apellido = unApellido;
        }
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String unaFecha) {
        if (unaFecha == null || unaFecha.isEmpty()) {
            this.fechaNacimiento = "Fecha no ingresada";
        } else {
            this.fechaNacimiento = unaFecha;
        }
    }

    public ImageIcon getFotoDePerfil() {
        return this.fotoDePerfil;
    }

    public void setFotoDePerfil(ImageIcon foto) {
        if (foto == null) {
            this.fotoDePerfil = new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        } else {
            this.fotoDePerfil = foto;
        }
    }

    public String getNombreCompleto() {
        String retorno;
        if (getNombre().equals(NULL_NOMBRE) && getApellido().equals(NULL_APELLIDO)) {
            retorno = NULL_NOMBRE;
        } else if (getNombre().equals(NULL_NOMBRE)) {
            retorno = getApellido();
        } else if (getApellido().equals(NULL_APELLIDO)) {
            retorno = getNombre();
        } else {
            retorno = getNombre() + " " + getApellido();
        }
        return retorno;
    }

    @Override
    public String toString() {
        return this.getNombreCompleto();
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj == null)
            return false;
        
        if(obj.getClass() != this.getClass())
            return false;
        
        Persona otraPersona = (Persona) obj;
        return this.getNombreCompleto().equals(otraPersona.getNombreCompleto());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + nombre.hashCode();
        result = 31 * result + apellido.hashCode();
        result = 31 * result + fechaNacimiento.hashCode();
        result = 31 * result + fotoDePerfil.hashCode();

        return result;
    }
}