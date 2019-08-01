package conversion;
import static constantes.Temperatura.CERO;

public class Temperatura {

    private double centigrados;

    public Temperatura(){
        this.centigrados=CERO.getValor();
    }

    public double getCentigrados() {
        return centigrados;
    }

    public void setCentigrados(double centigrados) {
        this.centigrados = centigrados;
    }
}
