package javabasics.OPPs;

class Students{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name +" "+ age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "david";
        s1.age = 21;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo("daivik",20);
    }
}
