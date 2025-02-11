package objetosExamenLibre.Pocimas;

import objetosExamenLibre.Pitufo;

public class PocimaDisenio extends Pocima {
    private double velocMin;
    private int maxAnios;
    private int maxHabilidades;

    public PocimaDisenio(double velocMin, int maxAnios, int maxHabilidades){
        this.velocMin = velocMin;
        this.maxAnios = maxAnios;
        this.maxHabilidades = maxHabilidades;
    }

    public double getVelocMin() {
        return velocMin;
    }

    public void setVelocMin(double velocMin) {
        this.velocMin = velocMin;
    }

    public int getMaxAnios() {
        return maxAnios;
    }

    public void setMaxAnios(int maxAnios) {
        this.maxAnios = maxAnios;
    }

    public int getMaxHabilidades() {
        return maxHabilidades;
    }

    public void setMaxHabilidades(int maxHabilidades) {
        this.maxHabilidades = maxHabilidades;
    }

    @Override
    public void aplicarPocima(Pitufo p) {  
        if((p.getVelocidad() > this.velocMin)|| (p.getAniosExperiencia()<this.maxAnios) || (p.getVelocidad()>this.velocMin && p.getHabilidades().size()<yhis.maxHabilidades)){   
            p.setAniosExperiencia(maxAnios);      
                
            
        }
    }

    

    
}


