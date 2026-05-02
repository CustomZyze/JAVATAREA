package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5);
        Moneda m1000 = new Moneda1000();
        try {
            Comprador c1 = new Comprador(m1000, Enumeracion.COCA_COLA, exp);
            System.out.println("Compraste: " + c1.queConsumiste());
        } catch (Exception e) {
            System.out.println("Error en la compra: " + e.getMessage());
        }
    }
}
