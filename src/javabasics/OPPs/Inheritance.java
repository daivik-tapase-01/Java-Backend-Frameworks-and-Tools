package javabasics.OPPs;

class Shape{
    String color;
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h) {
        System.out.println(0.5*l*h + " sq.cm");
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(0.5*l*h + " sq.cm");
    }
}

class Circle extends Shape{
    public void area(int r) {
        System.out.println(2.14*r*r + " sq.cm");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();

        Triangle t1 = new Triangle();
        t1.color = "red";
        System.out.println(t1.color);
        t1.area(3,6);

        EquilateralTriangle e1 = new EquilateralTriangle();
        e1.area(4,7);

        Circle c1 = new Circle();
        c1.area(4);

    }
}
