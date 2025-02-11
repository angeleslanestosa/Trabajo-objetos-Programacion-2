package objetosExamenLibre.Pocimas;

import objetosExamenLibre.Pitufo;

public class PocimaReductora extends Pocima {
    private int reduccion;

    public PocimaReductora(int reduccion){
        this.reduccion = reduccion;
    }

    public int getReduccion() {
        return reduccion;
    }

    public void setReduccion(int reduccion) {
        this.reduccion = reduccion;
    }

    @Override
    public void aplicarPocima(Pitufo p) {
        int nuevoValor = p.getAniosExperiencia() - this.reduccion;
        p.setAniosExperiencia(nuevoValor);
    }
}
