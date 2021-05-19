package com.comarch.obiektowosc.modyfikatory;

public class Square {
    private int a;
    private int field;
    private int circuit;

    public Square(int a1) {
        a = a1;
        field = a1 * a1;
        circuit = a1 * 4;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        this.field = a*a;
        this.circuit = 4*a;
    }

    public int getField() {
        return field;
    }

    public int getCircuit() {
        return circuit;
    }
}
