package org.example;

public class Expendedor {

    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Moneda> monVu;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> super8;
    private Deposito<Dulce> snicker;

    public Expendedor(int numProductos){
        coca = new Deposito<Bebida>();
        sprite = new Deposito<Bebida>();
        monVu = new Deposito<Moneda>();
        fanta = new Deposito<Bebida>();
        super8 = new Deposito<Dulce>();
        snicker = new Deposito<Dulce>();

        for(int i = 0 ; i < numProductos ; i++){
            coca.addAlgo(new CocaCola(100 + i));
            sprite.addAlgo(new Sprite(200 + i));
            fanta.addAlgo(new Fanta(300 + i));
            super8.addAlgo(new Super8(400 + i));
            snicker.addAlgo(new Snickers(500 + i));

        }

    }
    public Producto comprarProducto (Moneda m , Enumeracion cual) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {

        if(m == null){
            throw new PagoIncorrectoException();
        }
        if (m.getValor()< cual.getPrecio()){
            monVu.addAlgo(m);
            throw new PagoInsuficienteException();

        }
        Producto p = null;

        switch(cual){
            case COCA_COLA -> p = coca.getAlgo();
            case FANTA -> p = fanta.getAlgo();
            case SPRITE ->  p= sprite.getAlgo();
            case SUPER8 -> p= super8.getAlgo();
            case SNICKERS -> p= snicker.getAlgo();
        }
        if (p == null){
            monVu.addAlgo(m);
            throw new NoHayProductoException();
        }
        int diferencia = m.getValor() - cual.getPrecio();

        for(int i = 0; i < diferencia; i += 100){
            monVu.addAlgo(new Moneda100());
        }

        return p;
    }

    public Moneda getVuelto(){
        return monVu.getAlgo();

    }
}
