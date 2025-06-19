package javabasics.OPPs;

class Pen{
    String color;
    String type; // ballpoint , gel , ink

    public void write(){
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println("Writing....");
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
    }

    Student(){
        System.out.println("constructor called.");
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ink";
        pen2.write();


        Student s1 = new Student("dollar", 27);
        s1.name = "Daivik";
        s1.age = 20;
        s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();


    }
}
