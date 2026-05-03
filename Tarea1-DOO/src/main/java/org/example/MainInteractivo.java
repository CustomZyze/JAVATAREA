package org.example;
import java.util.Scanner;

public class MainInteractivo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Maquina Expendedora");
        int eleccion = 0;
        boolean maquina = true;
        Expendedor exp1 = new Expendedor(13);

        while (maquina) {
            System.out.println("Escoga que desea hacer:\n1.Comprar producto\n2.Salir\n");
            eleccion = s.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("PRODUCTOS EN MAQUINA");
                    System.out.println("1.Coca Cola: $"+ Enumeracion.COCA_COLA.getPrecio()+"\n2.Sprite: $" +Enumeracion.SPRITE.getPrecio()+
                            "\n3.Fanta: $"+Enumeracion.FANTA.getPrecio()+"\n4.Super8: $"+Enumeracion.SUPER8.getPrecio()+ "\n5.Snickers: $"
                            +Enumeracion.SNICKERS.getPrecio() +"\n");

                    int eleccion2 = s.nextInt();
                    Moneda m = null;
                    Enumeracion producto = null;
                    switch (eleccion2){
                        case 1 -> producto = Enumeracion.COCA_COLA;
                        case 2 -> producto = Enumeracion.SPRITE;
                        case 3 -> producto = Enumeracion.FANTA;
                        case 4 -> producto = Enumeracion.SUPER8;
                        case 5 -> producto = Enumeracion.SNICKERS;
                    }


                    System.out.println("PAGAR CON: ");
                    System.out.println("1.$100\n2.$500\n3.1000");
                    int moneda = s.nextInt();
                    if(moneda == 1) {
                        m = new Moneda100();
                    }
                    if(moneda == 2) {
                        m = new Moneda500();
                    }
                    if(moneda == 3) {
                        m = new Moneda1000();
                    }

                    Comprador c1;
                    try {
                        c1 = new Comprador(m, producto, exp1);
                        System.out.println("Consumiste: " + c1.queConsumiste());
                        System.out.println("Vuelto: " + c1.cuantoVuelto()+"\n");

                    } catch (NoHayProductoException e) {
                        System.out.println("Error en la compra: " + e.getMessage());
                        System.out.println("Vuelto: " + exp1.getVuelto());
                    } catch (PagoIncorrectoException f) {
                        System.out.println("Error en la compra: " + f.getMessage());
                    } catch (PagoInsuficienteException g) {
                        System.out.println("Error en la compra: " + g.getMessage());
                        System.out.println("Vuelto: " + exp1.getVuelto());
                    }
                    break;

                case 2:
                    System.out.println("GRACIAS");
                    maquina = false;
                    break;
                default:
                    System.out.println("Seleccion no valida, intente de nuevo.\n");
            }
        }
    }
}
