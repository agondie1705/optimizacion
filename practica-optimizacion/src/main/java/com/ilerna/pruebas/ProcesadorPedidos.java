package com.ilerna.pruebas;

import java.util.ArrayList;

/**
 * Código inicial para la práctica de refactorización.
 */
public class ProcesadorPedidos {

    public double procesar(ArrayList<String> a, ArrayList<Double> b) {
        double t = 0;

        for (int i = 0; i < b.size(); i++) {
            System.out.println("Añadiendo producto: " + a.get(i));
            t = t + b.get(i);
        }

        if (t > 100) {
            System.out.println("Descuento aplicado.");
            t = t - (t * 0.10);
        }

        double res = t + (t * 0.21);

        if (res < 500) {
            res = res + 15.95;
        }

        return res;
    }
}
