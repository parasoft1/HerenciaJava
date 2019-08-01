package constantes;

public enum Temperatura {

    CERO(0),
    NUEVE(9),
    CINCO(5),
    TREINTAYDOS(32);

    private int valor;
    Temperatura(int i) {
        this.valor=i;
    }

    public int getValor() {
        return valor;
    }
}
