package com.comarch.obiektowosc;

public class App2 {
    public static void main(String[] args) {
        Client c1 = new Client();

        c1.name = "Mateusz";
        c1.surname = "Bereda";
        c1.age = 30;
        c1.pesel = 3453445;

        Client c2 = new Client();

        c2.name = "Janusz";
        c2.surname = "Kowalski";
        c2.age = 40;
        c2.pesel = 2345345;

        System.out.println(c1.name);
        System.out.println(c2.name);

        String[] tab = new String[1000];

        System.out.println(tab[800]);

        Client[] clients = new Client[100];

        System.out.println(clients[40]);

        Client client1 = new Client();
        client1.name = "Karol";

        Client client2 = client1;
        client2.name = "Jan";

        System.out.println(client1.name);
        System.out.println(client2.name);
    }
}
