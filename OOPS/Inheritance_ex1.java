package OOPS;

//hybride inheritance.

class Shape {
    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area of Triangle is :- " + 1.0/2*l*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){                     //Multilevel Inheritance { shape -> Triangle -> EquilateralTriangle }
        System.out.println("Area of EquilateralTriangle is :- " + 1.0/2*l*h);
    }
}

class Circle extends Shape {
    public void area(int r){
        System.out.println("Area of Circle is :- " + (3.14)*r*r);     // Hierachial Inheritance { (Circle) <-[shpae]-> (Triangle) }
    }
}
public class Inheritance_ex1 {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();
        
        System.out.println();
        
        Triangle t1 = new Triangle();
        t1.area(5,6);

        System.out.println();

        EquilateralTriangle et1 = new EquilateralTriangle();
        et1.area(5,5);

        System.out.println();

        Circle c1 = new Circle();
        c1.area(5);
    }
}
