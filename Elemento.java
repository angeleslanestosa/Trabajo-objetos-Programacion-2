package objetosExamenLibre;

import java.util.ArrayList;

import objetosExamenLibre.Condiciones.Condicion;

public abstract class Elemento {
    
    public abstract double calcularVelocidad();     //funcion para calcular velocidad
    public abstract ArrayList<String> getHabilidades();   //funcion para obtener habilidades
    public abstract double getCreatividad();     //funcion para obtener la creatividad
    public abstract Elemento getCopia();      //funcion para obtener copia
    public abstract int cantidadPitufos(Condicion c);     //funcion para obtenr la cantidad de pitufos de acuerdo a condiciones
    
}


