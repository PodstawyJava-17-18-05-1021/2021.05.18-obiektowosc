package com.comarch.obiektowosc;

public class App {
    public static void main(String[] args) {
        String name1 = "sdfgsdf";
        String surname1 = "dsfgsdf";
        int age1 = 20;
        int pesel1 = 356345634;

        String[] names = new String[1000];
        String[] surnames = new String[1000];
        int[] ages = new int[1000];
        int[] pesele = new int[1000];

        Client[] clients = new Client[1000];

        Client k = new Client();

        Client k2 = new Client();

        k.name = "Mateusz";

        k2.name = "Janusz";
    }
}
