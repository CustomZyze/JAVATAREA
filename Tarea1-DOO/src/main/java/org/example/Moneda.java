package org.example;

public abstract class Moneda implements Comparable<Moneda> {
    public Moneda(){

    }

    public String toString(){
        return "Serie: " + this.hashCode() + " | Valor: " + this.getValor();
    }

    public abstract int getValor();

    @Override
    public int compareTo(Moneda s){
        return Integer.compare(this.getValor(), s.getValor());
    }
}