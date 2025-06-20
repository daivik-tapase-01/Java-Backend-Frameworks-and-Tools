package javabasics.OPPs;

interface Animals{
    void walk();
}

interface Herbivore{
    void eats();
}

class Goat implements Animals, Herbivore{
    @Override
    public void walk() {
        System.out.println("walks on 4 legs");
    }

    @Override
    public void eats() {
        System.out.println("eats grass");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Goat d1 = new Goat();
        d1.walk();
        d1.eats();
    }
}
