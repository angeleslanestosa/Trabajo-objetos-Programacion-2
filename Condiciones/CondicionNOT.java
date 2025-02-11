package objetosExamenLibre.Condiciones;

import objetosExamenLibre.Pitufo;

public class CondicionNOT extends Condicion {
    private Condicion c1;

    public CondicionNOT(Condicion c1){
        this.c1 = c1;
    }

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }

    public boolean cumple(Pitufo p){
        return !c1.cumple(p);
    }
}
