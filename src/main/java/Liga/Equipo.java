package Liga;

public class Equipo {
    //Atributos
    int codEquipo,titulos;
    String nombreEquipo, ciudad, mascota, estadio, nomina, entrenador;

    //Matedo constructor
    public Equipo(int codEquipo, String nombreEquipo) {
        this.codEquipo = codEquipo;
        this.nombreEquipo = nombreEquipo;
    }
    public void ingresaEquipo(int titulos, String ciudad, String mascota){
        this.titulos=titulos;
        this.ciudad=ciudad;
        this.mascota=mascota;
    }
    public String mostrarEquipo(){
        return "El equipo "+nombreEquipo+" Es local en la ciudad de "+ciudad+" tiene "+titulos+" titulos en su vitrina "+
                " su mascota es "+mascota;
    }
    public String contratarJugadores(){
        return"El equipo contrata jugadores";
    }
    public void generarEntrenamientos(){
        System.out.println("El equipo genera entrenamientos");
    }
    public void jugarTorneos(){
        System.out.println("El equipo juega torneos");
    }
}

