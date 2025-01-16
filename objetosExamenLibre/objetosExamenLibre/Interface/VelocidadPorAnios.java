package objetosExamenLibre.Interface;

import objetosExamenLibre.Pitufo;

public class VelocidadPorAnios implements Velocidad {
    private double numero;

    public VelocidadPorAnios(double numero){
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    @Override
    public double calcularVelocidad(Pitufo p) {
        return this.getNumero()/p.getAniosExperiencia();
    }

    
}
