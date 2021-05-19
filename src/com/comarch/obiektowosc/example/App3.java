package com.comarch.obiektowosc.example;

import com.comarch.obiektowosc.Client;

public class App3 {
    public static void main(String[] args) {
        Client c = new Client();

        int a = 3;
        int b = 6;

        int karteczkaZWynikiem = c.dodaj(a, b);

        System.out.println(karteczkaZWynikiem);

        c.name = "Mateusz";

        System.out.println(c.podajImie());

        c.powiedzImie();

        System.out.println(c.dodaj(3.3, 5.5));

        System.out.println(c.dodaj("Witam", "Wszystkich"));

        System.out.println("------------------------------");
        System.out.println(c.name);
        System.out.println(c.surname);
        System.out.println(c.age);
        System.out.println(c.pesel);

        System.out.println("--------------------------------");

        Client c2 = new Client("Jan", "Kowalski", 30, 345234);

        System.out.println(c2.name);
        System.out.println(c2.surname);
        System.out.println(c2.age);
        System.out.println(c2.pesel);

        System.out.println("------------------------------------");
        Square square = new Square(5);

        System.out.println(square.a);
        System.out.println(square.field);
        System.out.println(square.circuit);
    }
}
