package main;

import constantes.Mensajes;
import conversion.TemperaturaLogica;

import javax.swing.*;

public class Main {

    public static void main(String[] args){



        String valorTemperatura= JOptionPane.showInputDialog(null, Mensajes.MENSAJES_INGRESO.getMensaje());

        TemperaturaLogica temp = new TemperaturaLogica();

        double temparaturaConvert=Double.parseDouble(valorTemperatura);

        temp.setCentigrados(temparaturaConvert);

        JOptionPane.showMessageDialog(null,Mensajes.MENSAJE_CONVERSION.getMensaje()+ temp.getCentigrados() + Mensajes.MENSAJE_RESULTADO.getMensaje() + temp.calcularTemperaturaFarenheit() + " °F");

    }




}
