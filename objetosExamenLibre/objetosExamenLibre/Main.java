package objetosExamenLibre;

import java.util.ArrayList;
import java.util.Collections;

import objetosExamenLibre.Condiciones.CondicionAniosExperiencia;
import objetosExamenLibre.Condiciones.CondicionHabilidad;
import objetosExamenLibre.Condiciones.CondicionVelocYHabilidades;
import objetosExamenLibre.Condiciones.CondicionVelocidad;
import objetosExamenLibre.Pocimas.PocimaCalculadoraVelocidad;
import objetosExamenLibre.Pocimas.PocimaCompuesta;
import objetosExamenLibre.Pocimas.PocimaDisenio;
import objetosExamenLibre.Pocimas.PocimaReductora;

public class Main {
    public static void main(String[] args) {
        
        Pitufo pManitas = new Pitufo("Manitas", 8, 4.2);
        Pitufo pFilosofo = new Pitufo("Filosofo", 12, 3.5);
        Pitufo pGoloso = new Pitufo("Goloso", 5, 30, 2.8);
        Pitufo pGranjero = new Pitufo("Granjero", 10, 4.7);
        PitufoRebelde pTrotamundos = new PitufoRebelde("Trotamundos", 7, 6.0, 10);
        PitufoEgocentrico pVanidoso = new PitufoEgocentrico("Vanidoso", 4, 3.3, 10);
        PitufoRebelde pMalhumoradoGrunion = new PitufoRebelde("Grunion", 15, 650, 5.5, 0);
        PitufoEgocentrico pEgocentricoSabio = new PitufoEgocentrico("Sabio", 20, 100, 8.0, 0);

        EquipoAPR eBrigadaA = new EquipoAPR("Brigada A");
        EquipoHPC eMagnificos = new EquipoHPC("Los Magnificos");
        EquipoCPE eEspecialistas = new EquipoCPE("Los Especialistas");
        EquipoHPC eRecolectores = new EquipoHPC("Recolectores");
        EquipoAPR eIndestructibles = new EquipoAPR("Los Indestructibles");


        pManitas.addHabilidad("Recoleccion Rapida");
        pManitas.addHabilidad("Clasificacion de pitufresas");
        
        pFilosofo.addHabilidad("Conservacion");
        pFilosofo.addHabilidad("Planificacion");

        pGoloso.addHabilidad("Cocina");
        pGoloso.addHabilidad("Recoleccion rapida");

        pGranjero.addHabilidad("Clasificacion de pitufresas");
        pGranjero.addHabilidad("Cuidado de plantas");

        pTrotamundos.addHabilidad("Aventura");
        pTrotamundos.addHabilidad("Cartografia");

        pVanidoso.addHabilidad("Estilo");
        pVanidoso.addHabilidad("Organizacion");

        pMalhumoradoGrunion.addHabilidad("Trabajo en equipo");

        pEgocentricoSabio.addHabilidad("Liderazgo");
        pEgocentricoSabio.addHabilidad("Estrategia avanzada");

        eBrigadaA.addMiembro(pManitas);
        eBrigadaA.addMiembro(pGranjero);

        eMagnificos.addMiembro(pFilosofo);
        eMagnificos.addMiembro(pGoloso);

        eEspecialistas.addMiembro(pEgocentricoSabio);
        eEspecialistas.addMiembro(pMalhumoradoGrunion);

        eRecolectores.addMiembro(eBrigadaA);
        eRecolectores.addMiembro(pVanidoso);
        eRecolectores.addMiembro(eMagnificos);

        eIndestructibles.addMiembro(pTrotamundos);
        eIndestructibles.addMiembro(eEspecialistas);     
        eIndestructibles.addMiembro(eRecolectores);  
        

        double velocManitas = pManitas.getVelocidad();
        double creatManitas = pManitas.getCreatividad();
        System.out.println("La velocidad del pitufo Manitas es de: " + velocManitas + ", y su creatividad es de: " + creatManitas);
        
        double velocFilosofo = pFilosofo.getVelocidad();
        double creatFilosofo = pFilosofo.getCreatividad();
        System.out.println("La velocidad del pitufo Filosofo es de: " + velocFilosofo + ", y su creatividad es de: " + creatFilosofo);

        double velocGoloso = pGoloso.getVelocidad();
        double creatGoloso = pGoloso.getCreatividad();
        System.out.println("La velocidad del pitufo Goloso es de: " + velocGoloso + ", y su creatividad es de: " + creatGoloso);

        double velocGranjero = pGranjero.getVelocidad();
        double creatGranjero = pGranjero.getCreatividad();
        System.out.println("La velocidad del pitufo Granjero es de: " + velocGranjero + ", y su creatividad es de: " + creatGranjero);

        double velocTrotamundos = pTrotamundos.calcularVelocidad();
        double creatTrotamundos = pTrotamundos.getCreatividad();
        System.out.println("La velocidad del pitufo Trotamundos es de: " + velocTrotamundos + ", y su creatividad es de: " + creatTrotamundos);

        double velocVanidoso = pVanidoso.calcularVelocidad();
        double creatVanidoso = pVanidoso.getCreatividad();
        System.out.println("La velocidad del pitufo vanidoso es de: " + velocVanidoso + ", y su creatividad es de: " + creatVanidoso);
    
        double velocGrunion = pMalhumoradoGrunion.calcularVelocidad();
        double creatGrunion = pMalhumoradoGrunion.getCreatividad();
        System.out.println("La velocidad del pitufo Grunion es de: " + velocGrunion + ", y su creatividad es de: " + creatGrunion);

        double velocSabio = pEgocentricoSabio.calcularVelocidad();
        double creatSabio = pEgocentricoSabio.getCreatividad();
        System.out.println("La velocidad del pitufo Sabio es de: " + velocSabio + ", y su creatividad es de: " + creatSabio);

        double velocBrigadaA = eBrigadaA.calcularVelocidad();
        double creatBrigadaA = eBrigadaA.getCreatividad();
        System.out.println("La velocidad del equipo Brigada A es de: " + velocBrigadaA + ", y su creatividad es de: " + creatBrigadaA);

        double velocMagnificos = eMagnificos.calcularVelocidad();
        double creatMagnificos = eMagnificos.getCreatividad();
        System.out.println("La velocidad del equipo Los Magnificos es de: " + velocMagnificos + ", y su creatividad es de: " + creatMagnificos);

        double velocEspecialistas = eEspecialistas.calcularVelocidad();
        double creatEspecialistas = eEspecialistas.getCreatividad();
        System.out.println("La velocidad del equipo Los Especialistas es de: " + velocEspecialistas + ", y su cretaividad es de: " + creatEspecialistas);

        double velocRecolectores = eRecolectores.calcularVelocidad();
        double creatRecolectores = eRecolectores.getCreatividad();
        System.out.println("La velocidad del equipo Recolectores es de: " + velocRecolectores + ", y su creatividad es de: " + creatRecolectores);

        double velocIndestructibles = eIndestructibles.calcularVelocidad();
        double creatIndestructibles = eIndestructibles.getCreatividad();
        System.out.println("La velocidad del equipo Los Indestructibles es de: " + velocIndestructibles + ", y su creatividad es de: " + creatIndestructibles);


        ArrayList<String> habIndestructibles = eIndestructibles.getHabilidades();
        System.out.println("Las habilidades del equipo Los Indestructibles son: " + habIndestructibles);

        Equipo copia = (Equipo) eIndestructibles.getCopia();
        copia.setNombre("Exterminators");
        
        CondicionAniosExperiencia cAnios = new CondicionAniosExperiencia(8);
        CondicionVelocidad cVelocidad = new CondicionVelocidad(40);
        CondicionHabilidad cHabilidad = new CondicionHabilidad("Clasificacion de pitufresas");
        CondicionVelocYHabilidades cVelocHab = new CondicionVelocYHabilidades(40, 2);
        
        int totalMayorAnios = eIndestructibles.cantidadPitufos(cAnios);
        System.out.println("La cantidad de pitufos con mas de 8 anios de experiencia es de: " + totalMayorAnios);
        
        int totalMayorVeloc = eIndestructibles.cantidadPitufos(cVelocidad);
        System.out.println("La cantidad de pitufos con la velocidad de trabajo superior a 40 es de: " + totalMayorVeloc);

        int totalHabilidad = eIndestructibles.cantidadPitufos(cHabilidad);
        System.out.println("La cantidad de pitufos que tienen la habilidad de clasificacion de pitufresas es de: " + totalHabilidad);

        int totalVeloYHab = eIndestructibles.cantidadPitufos(cVelocHab);
        System.out.println("La cantidad de pitufos con la velocidad de trabajo superior a 40 y con mas de 2 habilidades es de: " + totalVeloYHab);
    
        PocimaReductora reductora = new PocimaReductora(5);
        PocimaCalculadoraVelocidad velocidad = new PocimaCalculadoraVelocidad();
        PocimaDisenio disenio = new PocimaDisenio(0, 10, 4);
        PocimaCompuesta compuesta = new PocimaCompuesta();
        compuesta.addPosima(reductora);
        compuesta.addPosima(velocidad);
        compuesta.addPosima(disenio);
        
        eIndestructibles.aplicarPocimaATodos(compuesta);   //chequear si es asi porque es con el equipo exterminators, que es el indestructible con el nombre cambiado
        System.out.println("La velocidad del equipo Exterminators es de: " + eIndestructibles.calcularVelocidad());
        System.out.println("La creatividad del equipo Extermiantors es de: " + eIndestructibles.getCreatividad());
        System.out.println("Las habilidades del equipo Extermiantors son: " + eIndestructibles.getHabilidades());

        int totalAniosEquipo = eIndestructibles.cantidadPitufos(cAnios);
        System.out.println("La cantidad de pitufos con mas de 8 anios de experiencia en el equipo Exterminators es de: " + totalAniosEquipo);
        int totalVelocEquipo = eIndestructibles.cantidadPitufos(cVelocidad); 
        System.out.println("La cantidad de pitufos con una velocidad superior a 40 en el equipo Exterminators es de: " + totalVelocEquipo);
        int totalHabilidadEquipo = eIndestructibles.cantidadPitufos(cHabilidad);
        System.out.println("La cantidad de pitufos del equipo Exterminators que posee la habilidad de clasificacion de pitufreses es de: " + totalHabilidadEquipo);
        int totalVelocHabEquipo = eIndestructibles.cantidadPitufos(cVelocHab);
        System.out.println("La cantidad de pitufos con la velocidad mayor a 40 y con mas de 2 habilidades en el equipo Exterminators es de: " + totalVelocHabEquipo);

        ArrayList<Pitufo> pitufos = new ArrayList<>();
        pitufos.add(pManitas);
        pitufos.add(pFilosofo);
        pitufos.add(pGoloso);
        pitufos.add(pGranjero);
        pitufos.add(pTrotamundos);
        pitufos.add(pVanidoso);
        pitufos.add(pMalhumoradoGrunion);
        pitufos.add(pEgocentricoSabio);
        
        Collections.sort(pitufos);
        for(Pitufo p : pitufos){
            System.out.println(p);  //llama a toString e imprime info de cada pitufo
        }




    }
}
