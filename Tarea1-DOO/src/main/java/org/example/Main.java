package org.example;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5,4);
        Moneda m1000 = new Moneda1000();
        try {
            Comprador c1 = new Comprador(m1000, Enumeracion.COCA_COLA, exp);
            System.out.println("Compraste: " + c1.queConsumiste());
        } catch (Exception e) {
            System.out.println("Error en la compra: " + e.getMessage());
        }
    }
}
