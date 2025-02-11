package objetosExamenLibre.Condiciones;

import objetosExamenLibre.Pitufo;

public class CondicionCreatividad extends Condicion {
    private double creat;

    public CondicionCreatividad(double creat){
        this.creat = creat;
    }

    public double getCreat() {
        return creat;
    }

    public void setCreat(double creat) {
        this.creat = creat;
    }

    public boolean cumple(Pitufo p){
        return p.getCreatividad() == this.getCreat();
    }
}
