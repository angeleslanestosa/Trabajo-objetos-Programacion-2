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
    public void aplicarPocima(Pitufo p) {    //si el pitufo cumple con las condiciones realiza alguna accion
        if(p.getVelocidad() > this.velocMin){    //si la velocidad del pitufo es mayor a la min
            if(p.getAniosExperiencia()<this.maxAnios){    //si los anios de experiencia del pitufo son menores al max
                if(p.getVelocidad()> this.velocMin && p.getHabilidades().size()<this.maxHabilidades){  //y si la velocidad del pitufo es mayor a la min y la cant de habilidades es menor a la min
                    p.setAniosExperiencia(maxAnios);      //cambia los anios de experiencia a max
                }
            }
        }
    }

    

    
}


