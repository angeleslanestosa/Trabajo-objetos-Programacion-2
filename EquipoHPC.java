package objetosExamenLibre;

import java.util.ArrayList;

public class EquipoHPC extends Equipo{
    
    public EquipoHPC(String nombre){
        super(nombre);
    }

    @Override
    public double calcularVelocidad() {
        if(!miembros.isEmpty()){    //si el array de miembro no esta vacio, es decir que hay miembros en el array
            Elemento ultimo = miembros.get(miembros.size()-1);    //obtengo el ultimo miembro de la lista
            return ultimo.calcularVelocidad();     //y retorno la velocidad del ultimo miembro
        }
        return 0;     //sino retorno 0
    } 

    @Override
    public double getCreatividad() {
        double creatMax = 0;    //variable para almacenar la creat max

        for(Elemento m : miembros){   //recorro array de miembros
            double creat = m.getCreatividad();   //almaceno en creat la creatividad del miembro especifico
            if(creat>creatMax){     //si la creat del miembro es mayor a la creat max
                creatMax = creat;    //la creat max toma el valor de la creat del miembro
            }
        }
        return creatMax;    //retorno la creat max
    }


    @Override
    protected Equipo getCascaron() {
        return new EquipoHPC (super.getNombre());    //copia del equipo hpc
    }

    

    
}
