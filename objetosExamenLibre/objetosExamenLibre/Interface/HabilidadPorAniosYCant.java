package objetosExamenLibre.Interface;

import objetosExamenLibre.Pitufo;

public class HabilidadPorAniosYCant implements Habilidad {
    
    @Override
    public double calcularHabilidad(Pitufo p) {
        return p.getAniosExperiencia() + p.getHabilidades().size();
    }

    
}
