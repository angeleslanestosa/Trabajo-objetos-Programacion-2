package objetosExamenLibre.Pocimas;

import java.util.ArrayList;

import objetosExamenLibre.Pitufo;

public class PocimaCompuesta extends Pocima {
    private ArrayList<Pocima> pocimas;

    public PocimaCompuesta(){
        pocimas = new ArrayList<Pocima>();
    }

    public void addPosima(Pocima p){
        this.pocimas.add(p);
    }

    public boolean TienePosima(Pocima p){
        return pocimas.contains(p);
    }

    @Override
    public void aplicarPocima(Pitufo p) {
        for(Pocima pos : pocimas){    //recorro array de pocimas 
            pos.aplicarPocima(p);     //y por cada pocima se la aplico al pitufo correspondiente
        }
    }
}
