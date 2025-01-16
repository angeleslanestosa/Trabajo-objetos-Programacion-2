package objetosExamenLibre;

public class PitufoEgocentrico extends Pitufo {       //mismo caso para pitufo supremo
    private int mentira;

    public PitufoEgocentrico(String nombre, int aniosExperiencia, double velocidad, double creatividad, int mentira){
        super(nombre, aniosExperiencia, velocidad, creatividad);
        this.mentira = mentira;
    }
    public PitufoEgocentrico(String nombre, int aniosExperiencia, double creatividad, int mentira){
        super(nombre, aniosExperiencia, creatividad);
        this.mentira = mentira;
    }

    public int getMentira() {
        return mentira;
    }

    public void setMentira(int mentira) {
        this.mentira = mentira;
    }

    public double calcularVelocidad(){
        return super.getVelocidad() * mentira;
    }

    public double getCreatividad(){
        return super.getCreatividad() * mentira;
    }

    public int getAniosExperiencia(){
        return super.getAniosExperiencia() * mentira;
    }

    public Pitufo getCascaron(){
        return new PitufoEgocentrico(super.getNombre(), super.getAniosExperiencia(), super.getVelocidad(), super.getCreatividad(), mentira);
    }

    

}
