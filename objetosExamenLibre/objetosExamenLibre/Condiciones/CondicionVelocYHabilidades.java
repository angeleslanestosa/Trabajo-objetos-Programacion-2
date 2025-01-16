package objetosExamenLibre.Condiciones;

import objetosExamenLibre.Pitufo;

public class CondicionVelocYHabilidades extends Condicion {
    private double velocMin;
    private int cantHab;

    public CondicionVelocYHabilidades(double velocMin, int cantHab){
        this.velocMin = velocMin;
        this.cantHab = cantHab;
    }

    public double getVelocMin() {
        return velocMin;
    }

    public void setVelocMin(double velocMin) {
        this.velocMin = velocMin;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    @Override
    public boolean cumple(Pitufo p) {
        return p.getVelocidad()> this.velocMin && p.getHabilidades().size()> this.cantHab;
    }

    
}
