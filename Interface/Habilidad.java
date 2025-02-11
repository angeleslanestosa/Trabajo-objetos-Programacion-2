package objetosExamenLibre.Interface;

import objetosExamenLibre.Pitufo;

public interface Habilidad {
    public double calcularHabilidad(Pitufo p);    //funcion para calcular la habilidad del pitufo pasado por parametro y se utiliza interface ya que cada pitufo puede calcular la habilidad de una manera distinta
}
