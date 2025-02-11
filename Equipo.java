package objetosExamenLibre;

import java.util.ArrayList;

import objetosExamenLibre.Condiciones.Condicion;
import objetosExamenLibre.Pocimas.Pocima;


public abstract class Equipo extends Elemento{
    protected ArrayList<Elemento> miembros;
    private String nombre;

    public Equipo(String nombre){
        this.nombre = nombre;
        miembros = new ArrayList<Elemento>();
    }

    public void addMiembro(Elemento m){    //agrego elementos controlando repetidos
        if(!this.miembros.contains(m)){
            this.miembros.add(m);
        }
    }

    public boolean tieneMiembro(Elemento e){      //controlo si la lista contiene el elemento pasado por parametro
        if(miembros.contains(e)){
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public abstract double calcularVelocidad();

    public abstract double getCreatividad();

    public ArrayList<String> getHabilidades() {
        ArrayList<String> hab = new ArrayList<>();    //creo copia de array vacio
        for(Elemento m : miembros){   //recorro los miembros de array
            ArrayList<String> habMiembro = m.getHabilidades();   //creo otro array y para almacenar las habilidades del miembro especifico
            for(String h : habMiembro){   //recorremos cada hab de los miembros
                if(!hab.contains(h)){   //y para cada habilidad verificamos repetidos
                    hab.add(h);        //si no hay repetidos aniade la hab al array
                }
            }
        }
        return hab;      //retornamos la copia 
    }

    protected abstract Equipo getCascaron();    //no se puede hacer new de quipo ya que es clase abstracta (crearia nueva instancia del equipo)

    public int cantidadPitufos(Condicion c){    //si el pitufo cumple con la condicion, lo cuenta. al final detorna la catidad de pitufos que cumplen con la condicion 
        int cantidad = 0; 
        for(Elemento m : miembros){
            cantidad = cantidad + m.cantidadPitufos(c);
        }
        return cantidad;

    }

    @Override
    public Elemento getCopia() {        //copia de equipo 
        Equipo copia = getCascaron();
        for(Elemento m : miembros){
            copia.addMiembro(m.getCopia());
        }
        return copia;
    }

    public void aplicarPocimaATodos(Pocima p){
        for(Elemento m : miembros){   //recorro los miembros del array
            if(m instanceof Pitufo)  //verifico que el miembro (objeto) sea del tipo Pitufo
                p.aplicarPocima((Pitufo) m);   //si lo es, aplico la posima al miembro pitufo
        }
    }
    
    
}
