package objetosExamenLibre;

import java.util.ArrayList;

import objetosExamenLibre.Condiciones.Condicion;
import objetosExamenLibre.Interface.Habilidad;
import objetosExamenLibre.Interface.Velocidad;

public class Pitufo extends Elemento implements Comparable<Pitufo>{
    private String nombre;
    private int aniosExperiencia;
    private double velocidad;
    private double creatividad;
    private ArrayList <String> habilidades;
    private Velocidad veloc;
    private Habilidad hab;

    public Pitufo(String nombre, int aniosExperiencia, double velocidad, double creatividad){
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
        this.velocidad = velocidad;
        this.creatividad = creatividad;
        habilidades = new ArrayList<String>();
    }
    public Pitufo(String nombre, int aniosExperiencia, double creatividad){
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
        this.creatividad = creatividad;
        habilidades = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    public double getCreatividad() {
        return creatividad;
    }

    public void setCreatividad(double creatividad) {
        this.creatividad = creatividad;
    }

    public void addHabilidad(String h){
        habilidades.add(h);
    }

    public boolean tieneHabilidad(String h){     //metodo para saber si tiene habilidad pasada por parametro
        if(habilidades.contains(h)){
            return true;
        }
        return false;
    }

    public ArrayList<String> getHabilidades(){
        return new ArrayList<>(this.habilidades);
    }

    public String getPrimerHabilidad(){
        if(!habilidades.isEmpty()){
            return habilidades.get(0);
        }
        return null;
    }

    public Pitufo getCascaron(){
        return new Pitufo (nombre, aniosExperiencia, velocidad, creatividad);
    }

    public Elemento getCopia(){
        Pitufo copia = getCascaron();      
        for(String hab : habilidades){   //recorremos la lista de habilidades
            copia.addHabilidad(hab);       //agregamos habilidades a la copia de pitufo
        }
        return copia;
    }


    public int cantidadPitufos(Condicion c){   //si el pitufo cumple con la condicion, retorna la cantidad que es 1, si no cumple retorna 0
        if(c.cumple(this)){
            return 1;    
        }          
        return 0;
    }

    public int compareTo(Pitufo p){
        int res = this.getAniosExperiencia() - p.getAniosExperiencia();   //comparamos los anios de experiencia del pitufo (this) con los anios de experiencia del pitufo pasado por parametro
        if(res == 0){                                                      //si el resultado del if es 0 (ambos tienen las misma cantidad de anios de experiencia)
            res = Double.compare(this.getCreatividad(), p.getCreatividad());   //compara el grado de creatividad de ambos pitufos
            if(res == 0){                                                     //si el resultado del if es 0 (ambos tienen el mismo grado de creatividad)
                return this.getNombre().compareTo(p.getNombre());           //comparo el nombre de ambos
            }
        }
        return res;                                              

    }

    public Velocidad getVeloc() {
        return veloc;
    }

    public void setVeloc(Velocidad veloc) {
        this.veloc = veloc;
    }

    public Habilidad getHab() {
        return hab;
    }

    public void setHab(Habilidad hab) {
        this.hab = hab;
    }

    @Override
    public double calcularVelocidad() {
        return this.getVelocidad();
    }
    @Override
    public String toString() {
        return "Pitufo [nombre=" + nombre + ", aniosExperiencia=" + aniosExperiencia + ", velocidad=" + velocidad
                + ", creatividad=" + creatividad + ", habilidades=" + habilidades + "]";
    }
    
    
    
    

}
