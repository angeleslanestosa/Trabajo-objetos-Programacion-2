package objetosExamenLibre.Interface;

import objetosExamenLibre.Pitufo;

public class HabilidadPorAnios implements Habilidad {
    private int anios;

    public HabilidadPorAnios(int anios){
        this.anios = anios;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    @Override
    public double calcularHabilidad(Pitufo p) {
        return this.getAnios()* p.getAniosExperiencia();
    }

    
}
