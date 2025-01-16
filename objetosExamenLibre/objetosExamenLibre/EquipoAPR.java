package objetosExamenLibre;

import java.util.ArrayList;

import objetosExamenLibre.Condiciones.Condicion;

public class EquipoAPR extends Equipo {
    public EquipoAPR(String nombre){
        super(nombre);
    }

    @Override
    public double calcularVelocidad() {
        double velocMax = 0;    //variable para almacenar la veloc max
        for(Elemento m : miembros){    //recorro los miembros del array
            double veloc = m.calcularVelocidad();  //en la variable veloc almaceno la velocidad del miembro
            if(veloc>velocMax){      //si la veloc es mayor a la veloc max almacenada
                velocMax = veloc;  //la veloc max toma el valor de veloc
            }
        }
        return velocMax;      //retorno veloc max 
    }

    @Override
    public double getCreatividad(){
        if(!miembros.isEmpty()){    // o puede ser if(miembros.size()>0)
            return miembros.get(0).getCreatividad();
        }
        return 0;
    }

    @Override
    public ArrayList<String> getHabilidades(){
        ArrayList<String> hab = new ArrayList<String>();   //creo copia vacia del array
        for(Elemento m : miembros){    //recorro array de miembros
            ArrayList<String> habMiembro = m.getHabilidades();    //almaceno en un array nuevo las habilidades de un miembro especifico
            for(String h : habMiembro){  //recorro las habilidades del nuevo array
                if(!hab.contains(h)){    //verifico que no haya repetidos
                    hab.add(h);    //si no hay repetidos, aniado la habilidad a la copia vacia
                }
            }
        }
        return hab;   //retorno la copia
    }

    @Override
    protected Equipo getCascaron() {
        return new EquipoAPR(super.getNombre());       //copia del equipo apr
    }

    @Override
    public int cantidadPitufos(Condicion c) {
        
        return super.cantidadPitufos(c);
    }

    

}

    

