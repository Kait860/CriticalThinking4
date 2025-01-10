//creates abstract Shape class with void methods area and perimeter
public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

//create rectangle class that extends Shape
class Rectangle extends Shape{
    //creates attributes
    double width;
    double length;

    //constructor to initialize data
    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }

    //create method to retrieve area
    @Override
    public double area(){
        return width * length;
    }

    //create method to retrieve perimeter
    @Override
    public double perimeter(){
        return 2 * (width * length);
    }

    //create method that prints the area and perimeter
    @Override
    public String toString(){
        return "Rectangle Area: " + area() + " and  Perimeter: " + perimeter() + "\n";
    }
}

//create circle class that extends Shape
class Circle extends Shape{
    //creates attribute
    double radius;

    //constructor to initialize data
    public Circle (double radius){
        this.radius = radius;
    }

    //create method to retrieve area
    @Override
    public double area(){
        return radius * radius * Math.PI;
    }

    //create method to retrieve perimeter
    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    //create method that prints the area and perimeter
    @Override
    public String toString(){
        return "Circle Area: " + area() + " and  Perimeter: " + perimeter() + "\n";
    }
}

//create triangle class that extends Shape
class Triangle extends Shape{
    //creates attributes
    double side1;
    double side2;
    double side3;

    //constructor to initialize data
    public Triangle (double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //create method to retrieve area
    @Override
    public double area(){
        
    }

    //create method to retrieve perimeter
    @Override
    public double perimeter(){
        
    }

    //create method that prints the area and perimeter
    @Override
    public String toString(){
        return "Triangle Area: " + area() + " and  Perimeter: " + perimeter() + "\n";
    }
}