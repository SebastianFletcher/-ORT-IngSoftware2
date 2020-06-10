package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public final class Ingesta implements Serializable {

    private String fechaDeIngesta;
    private ArrayList<Alimento> listaAlimentosPorFecha;

    public Ingesta(String fechaIngesta, ArrayList<Alimento> listaAlimento) {
        this.setFechaDeIngesta(fechaIngesta);
        this.setListaAlimentoPorFecha(listaAlimento);
    }

    public String getFechaDeIngesta() {
        return this.fechaDeIngesta;
    }

    public void setFechaDeIngesta(String unaFecha) {
        this.fechaDeIngesta = unaFecha;
    }

    public ArrayList<Alimento> getListaAlimentosPorFecha() {
        if (this.listaAlimentosPorFecha.isEmpty()) {
            return new ArrayList<>();
        } else {
            return this.listaAlimentosPorFecha;
        }
    }

    public void setListaAlimentoPorFecha(ArrayList<Alimento> listaAlimento) {
        if (listaAlimento == null || listaAlimento.isEmpty()) {
            this.listaAlimentosPorFecha = new ArrayList<>();
        } else {
            this.listaAlimentosPorFecha = listaAlimento;
        }
    }

    @Override
    public String toString() {
        if (this.listaAlimentosPorFecha.isEmpty()) {
            return "No hay alimentos ingeridos";
        } else {
            return "Lista de alimentos ingeridos" + this.getListaAlimentosPorFecha();
        }
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj == null)
            return false;
        
        if(obj.getClass() != this.getClass())
            return false;
        
        Ingesta otraIngesta = (Ingesta) obj;
        return this.getFechaDeIngesta().equals(otraIngesta.getFechaDeIngesta()) && 
                this.getListaAlimentosPorFecha().equals(otraIngesta.getListaAlimentosPorFecha());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + fechaDeIngesta.hashCode();
        
        for(Alimento aliemento : listaAlimentosPorFecha)
            result = 31 * result + aliemento.hashCode();
        
        return result;
    }

}
