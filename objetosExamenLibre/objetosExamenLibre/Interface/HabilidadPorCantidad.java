package objetosExamenLibre.Interface;

import objetosExamenLibre.Pitufo;

public class HabilidadPorCantidad implements Habilidad {

    private double numero;          //declaro atributo numero para poder hacer la division

    public HabilidadPorCantidad(double numero){
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    @Override
    public double calcularHabilidad(Pitufo p) {   //divido el numero decalrado por la cantidad total de habilidades (el tamanio de la lista)
        return this.getNumero()/p.getHabilidades().size();
    }

}
