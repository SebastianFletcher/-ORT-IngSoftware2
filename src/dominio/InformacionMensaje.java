package dominio;

import java.io.Serializable;
        
public class InformacionMensaje implements Serializable {

    private String mensaje;
    private String destinatario;
    private String remitente;

    public InformacionMensaje(String elRemitente, String elDestinatario, String elMensaje) {
        setRemitente(elRemitente);
        setDestinatario(elDestinatario);
        setMensaje(elMensaje);
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String elMensaje) {
        mensaje = elMensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String elDestinatario) {
        destinatario = elDestinatario;

    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String elRemitente) {
        this.remitente = elRemitente;
    }

    public void intercambiarRemitente() {
        String aux = destinatario;
        destinatario = remitente;
        remitente = aux;
    }

    @Override
    public String toString() {
        return getRemitente() + ": \n" + getMensaje();
    }

}
