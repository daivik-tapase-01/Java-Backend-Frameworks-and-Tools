package javabasics.OPPs;

abstract class Animal{
    abstract void walk();

    Animal(){
        System.out.println("you are creating a new animal.");
    }

    public void eat(){
        System.out.println("Animal eats...");
    }
}

class Horse extends Animal{
    Horse() {
        System.out.println("created a horse.");
    }

    @Override
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal{
    @Override
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();

        Chicken c1 = new Chicken();
        c1.walk();

    }
}
