package clases;

import javax.swing.*;
import java.text.DecimalFormat;

public class CambioDolaraPeso extends Monedas {

    DecimalFormat formato = new DecimalFormat("#.00");

    //Se solicita la cantidad y se realiza el cálculo a retornar
    public String calcularCambioPeso(){

        setCantidadDolares(Double.parseDouble(JOptionPane.showInputDialog("Ingrese por favor la cantidad de \n dolares para cambiar a pesos")));
        return formato.format(getCantidadDolares() * VALOR_DOLAR);
    }


}
