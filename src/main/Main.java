package main;

import clases.CambioPesoaDolar;
import clases.CambioDolaraPeso;
import clases.Monedas;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Monedas monedas = new Monedas();
        CambioPesoaDolar cambioPesoaDolar = new CambioPesoaDolar();
        CambioDolaraPeso cambioDolaraPeso = new CambioDolaraPeso();

        //Se solicita que se ingrese la moneda que se cambiara
        monedas.setMoneda(JOptionPane.showInputDialog("Ingrese por favor la moneda a cambiar \n 1. Dolar \n 2. Pesos"));

        //se controla que la moneda ingresada sea válida y se retorna el resultado del cálculo
        if (monedas.getMoneda().equals("1")) {
            JOptionPane.showMessageDialog(null, "El cambio de dolares a pesos es: \n" + cambioDolaraPeso.calcularCambioPeso());
        } else if (monedas.getMoneda().equals("2")) {
            JOptionPane.showMessageDialog(null, "El cambio a dolares es: \n" + cambioPesoaDolar.calcularCambioDolar());
        } else {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es válido");
        }

    }
}
