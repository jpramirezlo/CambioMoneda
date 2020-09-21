package clases;

import javax.swing.*;
import java.text.DecimalFormat;

public class CambioPesoaDolar extends Monedas {

    DecimalFormat formato = new DecimalFormat("#.00");

    //Se solicita la cantidad y se realiza el cálculo a retornar
    public String calcularCambioDolar(){

        setCantidadPesos(Double.parseDouble(JOptionPane.showInputDialog("Ingrese por favor la cantidad de pesos \n a cambiar a dolares")));
        return formato.format(getCantidadPesos() / VALOR_DOLAR);
    }


}
