package com.ilerna.pruebas;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ProcesadorPedidosTest {

    @Test
    public void testProcesarPedidoConDescuento() {
        ProcesadorPedidos proc = new ProcesadorPedidos();

        ArrayList<String> nombres =
            new ArrayList<>(Arrays.asList("Monitor", "Teclado"));

        ArrayList<Double> precios =
            new ArrayList<>(Arrays.asList(150.0, 50.0));

        double resultado = proc.procesar(nombres, precios);

        assertEquals(233.75, resultado, 0.01);
    }
}
