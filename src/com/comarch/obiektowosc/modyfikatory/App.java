package com.comarch.obiektowosc.modyfikatory;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Square square = new Square(5);

        System.out.println(square.getA());
        System.out.println(square.getField());
        System.out.println(square.getCircuit());

        square.setA(6);

        System.out.println("-------------------------");
        System.out.println(square.getA());
        System.out.println(square.getField());
        System.out.println(square.getCircuit());
    }
}
