package objetosExamenLibre.Condiciones;

import objetosExamenLibre.Pitufo;

public class CondicionAniosExperiencia extends Condicion {
    private int aniosMin;

    public CondicionAniosExperiencia(int aniosMin){
        this.aniosMin = aniosMin;
    }

    public int getAniosMin() {
        return aniosMin;
    }

    public void setAniosMin(int aniosMin) {
        this.aniosMin = aniosMin;
    }

    public boolean cumple(Pitufo p){
        return p.getAniosExperiencia() > this.getAniosMin();   
    }
}
