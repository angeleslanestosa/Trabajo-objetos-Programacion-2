package objetosExamenLibre;

import java.util.ArrayList;
import java.util.Collections;

public class Empresa {
    private ArrayList<Pitufo> miembrosReserva;

    public Empresa(){
        miembrosReserva = new ArrayList<Pitufo>();
    }

    public void addMiembro(Pitufo p){     //agergo pitufos de reserva
        miembrosReserva.add(p);
    }

    public Pitufo getPitufo(){
        Collections.sort(miembrosReserva);   //ordeno la lista de pitufos de reserva
        if(!miembrosReserva.isEmpty()){       //chequeo si no esta vacia la lista de pitufos de reserva
            return miembrosReserva.remove(0);   //si no esta vacia elimino el miembro que saco y sino retorno null
        }
        return null;       
    }

    
}
