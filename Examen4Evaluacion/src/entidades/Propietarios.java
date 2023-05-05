package entidades;

public class Propietarios extends Usuarios{

    public Propietarios(int numeroMascotas){
        super();
        this.numeroMascotas = numeroMascotas;
    }

    public Propietarios(){
        super();
    }
    private int numeroMascotas;

    // Getter And Setter ---------
    public int getnumeroMascotas() {
        return numeroMascotas;
    }

    public void setnumeroMascotas(int numeroMascotas) {
        this.numeroMascotas = numeroMascotas;
    }
}
