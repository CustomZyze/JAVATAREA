package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

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

        //Prueba Normal
        try {
            Moneda m1000 = new Moneda1000();
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


    }
}
