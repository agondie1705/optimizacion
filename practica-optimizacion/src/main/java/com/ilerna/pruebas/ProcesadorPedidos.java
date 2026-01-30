package com.ilerna.pruebas;

import java.util.ArrayList;

/**
 * Código inicial para la práctica de refactorización.
 */
public class ProcesadorPedidos {

    public double procesar(ArrayList<String> nombresProductos, ArrayList<Double> preciosProductos) {
        double total = 0;

        for (int i = 0; i < preciosProductos.size(); i++) {
            System.out.println("Añadiendo producto: " + nombresProductos.get(i));
            total = total + preciosProductos.get(i);
        }

        int LIMITE_DESCUENTO = 100;
		if (total > LIMITE_DESCUENTO) {
            System.out.println("Descuento aplicado.");
            double DESCUENTO = 0.10;
			total = total - (total * DESCUENTO);
        }

        double IVA = 0.21;
		double totalFinal = calcularIVA(total, IVA);

        int LIMITE_ENVIO = 500;
		totalFinal = aplicarGastosEnvio(totalFinal, LIMITE_ENVIO);

        return totalFinal;
    }

	private double aplicarGastosEnvio(double totalFinal, int LIMITE_ENVIO) {
		if (totalFinal < LIMITE_ENVIO) {
            double GASTO_ENVIO = 15.95;
			totalFinal = totalFinal + GASTO_ENVIO;
        }
		return totalFinal;
	}

	private double calcularIVA(double total, double IVA) {
		double totalFinal = total + (total * IVA);
		return totalFinal;
	}
}
