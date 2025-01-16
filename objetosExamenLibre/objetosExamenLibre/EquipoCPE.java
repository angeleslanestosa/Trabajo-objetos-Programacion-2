package objetosExamenLibre;

import java.util.ArrayList;

public class EquipoCPE extends Equipo{
    
    public EquipoCPE(String nombre){
        super(nombre);
    }

    @Override
    public double calcularVelocidad() {
        double creatMax = 0;     //variable para almacenar creatividad maxima
        for(Elemento m : miembros){    //recorro el array de miembros (de equipo)
            double creat = m.getCreatividad();  //almaceno la creatividad del miembro
            if(creat>creatMax){      //si la creatividad del miembro es mayor a la creatividad max
                creatMax = creat;     //la creatividad max toma el valor de la creatividad del miembro almacenada en creat
            }
        }
        return creatMax;      //retorno creatividad max
    }

    @Override
    public double getCreatividad() {
        double suma = 0;
        for(Elemento m : miembros){  //recorro los miembros del array
            suma = suma + m.calcularVelocidad();   //calculo la velocidad por miembro y las voy sumando y almacenando en suma
        }
        if(miembros.size() == 0){    //verifico si el tamanio del array es 0, si es cero retorno 0 porque no se puede dividir por 0, y sino paso al return final que calcula el promediio
            return 0;
        }
        return suma/miembros.size();   //calculo el promedio y lo retorno
    }

    @Override
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

    @Override
    protected Equipo getCascaron() {
        return new EquipoCPE (super.getNombre());   //copia del equipo cpe
    }

    

    
}
