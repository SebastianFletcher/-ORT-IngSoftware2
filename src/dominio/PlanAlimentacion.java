package dominio;

import java.io.Serializable;

public final class PlanAlimentacion implements Serializable {

    private String nombreDelPlan;
    private Usuario usuario;
    public Profesional profesional;
    public boolean fueAtendidoElPlan;
    private String[][] planDiaADia;

    public PlanAlimentacion(String unNombreDelPlan,
            Usuario unUsuario,
            Profesional unProfesional,
            boolean fueAtendido,
            String[][] unPlan) {

        this.setNombreDelPlan(unNombreDelPlan);
        this.setUsuario(unUsuario);
        this.setProfesional(unProfesional);
        this.setFueAtendidoElPlan(fueAtendido);
        this.setPlanDiaADia(unPlan);
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario unUsuario) {
        usuario = unUsuario;
    }

    public Profesional getProfesional() {
        return this.profesional;
    }

    public void setProfesional(Profesional unProfesional) {
        if (unProfesional == null) {
            this.profesional = new Profesional(null, null, null, null, null, null, null);
        } else {
            this.profesional = unProfesional;
        }
    }

    public boolean getFueAtendidoElPlan() {
        return fueAtendidoElPlan;
    }

    public void setFueAtendidoElPlan(boolean fueAtendido) {
        this.fueAtendidoElPlan = fueAtendido;
    }

    public String[][] getPlanDiaADia() {
        return this.planDiaADia;
    }

    public void setPlanDiaADia(String[][] unPlan) {
        this.planDiaADia = unPlan;
    }

    public String getNombreDelPlan() {
        return this.nombreDelPlan;
    }

    public void setNombreDelPlan(String unNombreDelPlan) {
        nombreDelPlan = unNombreDelPlan;
    }

    @Override
    public String toString() {
        return this.getNombreDelPlan();
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj == null)
            return false;
        
        if(obj.getClass() != this.getClass())
            return false;
        
        PlanAlimentacion otroPlanAlimentacion = (PlanAlimentacion) obj;
        return (this.getNombreDelPlan().equals(otroPlanAlimentacion.getNombreDelPlan())
                && this.getUsuario().equals(otroPlanAlimentacion.getUsuario())
                && this.getProfesional().equals(otroPlanAlimentacion.getProfesional()));
    }
    
    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + nombreDelPlan.hashCode();
        result = 31 * result + usuario.hashCode();
        result = 31 * result + profesional.hashCode();
        result = 31 * result + (fueAtendidoElPlan ? 1 : 0);
        
        for(int mes = 0; mes < planDiaADia.length; mes++)
            for(int dia = 0; dia < planDiaADia[mes].length; dia++ )
                result = 31 * result + planDiaADia[mes][dia].hashCode();

        return result;
    }

}