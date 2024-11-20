package Liga;

public class Arbitro {
    //Atributos
    int idArbitro, edad, aniosExper;
    double salario;
    String posicion, nombreArbitro;
    //Metodos

    public Arbitro(int idArbitro, String posicion, String nombreArbitro) {
        this.idArbitro = idArbitro;
        this.posicion = posicion;
        this.nombreArbitro = nombreArbitro;
    }
    public void pitar(){
        System.out.println("El arbitro pita partidos");
    }
    public void informes(){
        System.out.println("El arbitro realiza informes de los partidos");
    }
    public void sanciones(){
        System.out.println("El arbitro puede sancionar jugadores y equipos");
    }
}
