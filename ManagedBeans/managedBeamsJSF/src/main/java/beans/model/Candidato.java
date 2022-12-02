package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//Etiwueta tipo CDI para ManagedBeans
@Named
@RequestScoped
public class Candidato {
    private String nombre = "Introduce tu nombre";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
