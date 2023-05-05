package entidades;

public class Veterinarios extends Usuarios{

    public Veterinarios(String numeroColegiado){
        super();
        this.numeroColegiado = numeroColegiado;
    }

    public Veterinarios(){
        super();
    }
    private String numeroColegiado;

    // Getter And Setter ---------
    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
}
