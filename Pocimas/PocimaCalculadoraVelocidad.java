package objetosExamenLibre.Pocimas;

import objetosExamenLibre.Pitufo;

public class PocimaCalculadoraVelocidad extends Pocima {

    @Override
    public void aplicarPocima(Pitufo p) {
        int cantHabilidades = p.getHabilidades().size();   //guardo en variable la cantidad de habilidades
        double nuevaVeloc = p.getAniosExperiencia() + cantHabilidades;  //calculo la nueva velocidad sumando los anios de experiencia y la cant de habilidades
        p.setVelocidad(nuevaVeloc);   //cambio la velocidad por la velocidad nueva
    }
    
    
}
