package org.example;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("TESTEO DE EXCEPCIONES");
        //Prueba NoHayStock
        try {
            Moneda m1000 = new Moneda1000();
            Expendedor exp1 = new Expendedor(0);
            Comprador c1 = new Comprador(m1000, Enumeracion.SNICKERS, exp1);
            System.out.println("Compraste: " + c1.queConsumiste());
            System.out.println("Vuelto: " + c1.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println("Error en la compra: No queda stock.");
        } catch (PagoIncorrectoException e) {
            System.out.println("Error en la compra: Moneda nula.");
        } catch (PagoInsuficienteException e) {
            System.out.println("Error en la compra: Dinero insuficiente.");
        }

        //Prueba PagoIncorrecto
        try {
            Moneda m1000 = null;
            Expendedor exp1 = new Expendedor(12);
            Comprador c1 = new Comprador(m1000, Enumeracion.SNICKERS, exp1);
            System.out.println("Compraste: " + c1.queConsumiste());
            System.out.println("Vuelto: " + c1.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println("Error en la compra: No queda stock.");
        } catch (PagoIncorrectoException e) {
            System.out.println("Error en la compra: Moneda nula.");
        } catch (PagoInsuficienteException e) {
            System.out.println("Error en la compra: Dinero insuficiente.");
        }

        //Prueba PagoInsuficiente
        try {
            Moneda m100 = new Moneda100();
            Expendedor exp1 = new Expendedor(12);
            Comprador c1 = new Comprador(m100, Enumeracion.SNICKERS, exp1);
            System.out.println("Compraste: " + c1.queConsumiste());
            System.out.println("Vuelto: " + c1.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println("Error en la compra: No queda stock.");
        } catch (PagoIncorrectoException e) {
            System.out.println("Error en la compra: Moneda nula.");
        } catch (PagoInsuficienteException e) {
            System.out.println("Error en la compra: Dinero insuficiente.");
        }

        System.out.println();

        //Prueba Normal
        System.out.println("PRUEBA DE CADA PRODUCTO");
        Moneda m1000 = new Moneda1000();
        Expendedor exp1 = new Expendedor(12);
        for (Enumeracion prod : Enumeracion.values()) {
            try {
                Comprador c1 = new Comprador(m1000, prod, exp1);
                System.out.println("Compraste: " + c1.queConsumiste());
                System.out.println("Vuelto: " + c1.cuantoVuelto());
            } catch (NoHayProductoException e) {
                System.out.println("Error en la compra: No queda stock.");
            } catch (PagoIncorrectoException e) {
                System.out.println("Error en la compra: Moneda nula.");
            } catch (PagoInsuficienteException e) {
                System.out.println("Error en la compra: Dinero insuficiente.");
            }
        }

        //Prueba sorteo moneda
        ArrayList<Moneda> listaMonedas = new ArrayList<>();

        listaMonedas.add(new Moneda100());
        listaMonedas.add(new Moneda1000());
        listaMonedas.add(new Moneda500());
        listaMonedas.add(new Moneda100());
        listaMonedas.add(new Moneda100());
        listaMonedas.add(new Moneda500());
        listaMonedas.add(new Moneda1000());
        listaMonedas.add(new Moneda100());
        listaMonedas.add(new Moneda500());

        System.out.println("Lista desordenada: " + listaMonedas);
        listaMonedas.sort(null);
        System.out.println("Lista ordenada: " + listaMonedas);

    }
}
