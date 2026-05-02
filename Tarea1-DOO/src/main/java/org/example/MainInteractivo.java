package org.example;
import java.util.Scanner;

public class MainInteractivo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Maquina Expendedora");
        int eleccion = 0;
        boolean maquina = true;
        Moneda1000 m1000 = new Moneda1000();
        Expendedor exp1 = new Expendedor(10);

        while (maquina) {
            System.out.println("Escoga que desea hacer:\n1.Comprar bebida\n2.Salir\n");
            eleccion = s.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("BEBIDAS EN MAQUINA");
                    System.out.println("\n1.Coca Cola\n2.Sprite\n3.Fanta");
                    int bebida = s.nextInt();
                    Enumeracion producto = null;
                        if (bebida == 1) {
                            producto = Enumeracion.COCA_COLA;
                        }
                        if (bebida == 2) {
                            producto = Enumeracion.SPRITE;
                        }
                        if (bebida == 3) {
                            producto = Enumeracion.FANTA;
                        }

                    try {
                        Comprador c1 = new Comprador(m1000, producto, exp1);
                        System.out.println("Compraste: " + c1.queConsumiste());
                        System.out.println("Vuelto: " + c1.cuantoVuelto());

                    } catch (NoHayProductoException e) {
                        System.out.println("Error en la compra: No queda stock.");
                    } catch (PagoIncorrectoException e) {
                        System.out.println("Error en la compra: Moneda nula.");
                    } catch (PagoInsuficienteException e) {
                        System.out.println("Error en la compra: Dinero insuficiente.");
                    }
                    break;

                case 2:
                    System.out.println("GRACIAS");
                    maquina = false;
                    break;
            }

        }
    }
}
