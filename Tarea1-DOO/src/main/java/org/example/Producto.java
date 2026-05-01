package org.example;

public abstract class Producto{
    private int serie;

    public Producto(int serie){
        this.serie=serie;

    }
    public abstract String beber();

    public int getSerie(){
        return serie;
    }
}