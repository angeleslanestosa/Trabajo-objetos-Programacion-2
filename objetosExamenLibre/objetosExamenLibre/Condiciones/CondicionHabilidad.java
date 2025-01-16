package objetosExamenLibre.Condiciones;

import objetosExamenLibre.Pitufo;

public class CondicionHabilidad extends Condicion {
    private String hab;

    public CondicionHabilidad(String hab){
        this.hab = hab;
    }

    public String getHab() {
        return hab;
    }

    public void setHab(String hab) {
        this.hab = hab;
    }

    public boolean cumple(Pitufo p){
        return p.tieneHabilidad(hab);
    }
}
