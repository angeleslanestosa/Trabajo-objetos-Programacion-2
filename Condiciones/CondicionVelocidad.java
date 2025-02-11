package objetosExamenLibre.Condiciones;

import objetosExamenLibre.Pitufo;

public class CondicionVelocidad extends Condicion{
    private double veloc;

    public CondicionVelocidad(double veloc){
        this.veloc = veloc;
    }

    public double getVeloc() {
        return veloc;
    }

    public void setVeloc(double veloc) {
        this.veloc = veloc;
    }

    public boolean cumple(Pitufo p){
        return p.getVelocidad() == this.getVeloc();
        
    }
}
