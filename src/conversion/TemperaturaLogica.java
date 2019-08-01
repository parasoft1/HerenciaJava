package conversion;
import static constantes.Temperatura.*;

public class TemperaturaLogica extends Temperatura{

    public double calcularTemperaturaFarenheit(){

        return ((this.getCentigrados()*NUEVE.getValor()/CINCO.getValor())+TREINTAYDOS.getValor());

    }

}
