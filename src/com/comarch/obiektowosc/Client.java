package com.comarch.obiektowosc;

public class Client {
    public String name;
    public String surname;
    public int age;
    public int pesel;

    public Client() {
        System.out.println("Odpalil sie konstruktor Klienta !!");
    }

    public Client(String name, String surname, int age, int pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    public int dodaj(int pierwszySkladnik, int drugiSkladnik) {
        int wynik = pierwszySkladnik + drugiSkladnik;
        return wynik;
    }

    public double dodaj(double a, double b) {
        return a + b;
    }

    public String dodaj(String a, String b) {
        return a + b;
    }

    public String podajImie() {
        return name;
    }

    public void powiedzImie() {
        System.out.println(name);
    }
}
