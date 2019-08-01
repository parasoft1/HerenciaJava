package constantes;

public enum Mensajes {


    MENSAJES_INGRESO("ingrese temperatura grados"),
    MENSAJE_CONVERSION("la conversion de" ),
    MENSAJE_RESULTADO(" °C a Farenheit es ");

    private String mensaje;
    Mensajes(String s) {
        this.mensaje=s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
