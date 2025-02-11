package objetosExamenLibre;


public class PitufoRebelde extends Pitufo {     //mismo caso para pitufo malhumorado
    private double numero;

    public PitufoRebelde(String nombre, int aniosExperiencia, double velocidad, double creatividad, double numero){
        super(nombre, aniosExperiencia, velocidad, creatividad);
        this.numero = numero;
    }
    public PitufoRebelde(String nombre, int aniosExperiencia,double creatividad, double numero){
        super(nombre, aniosExperiencia, creatividad);
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double calcularVelocidad(){
        return super.getVelocidad() - this.getNumero();  
    }

    public double getCreatividad(){
        return super.getCreatividad() / this.getNumero();
    }

   public Pitufo getCascaron(){
        return new PitufoRebelde(super.getNombre(), super.getAniosExperiencia(), super.getVelocidad(), super.getCreatividad(), numero);
   }

    
}
