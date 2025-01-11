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
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s *(s - side1) * (s - side2) * (s - side3));
    }

    //create method to retrieve perimeter
    @Override
    public double perimeter(){
        return side1 + side2 + side3;
    }

    //create method that prints the area and perimeter
    @Override
    public String toString(){
        return "Triangle Area: " + area() + " and  Perimeter: " + perimeter() + "\n";
    }
}

class ShapeArray {
    public static void main(String[] args) throws Exception {
        //initialize shape values
        Rectangle rect = new Rectangle(5.0,8.0);
        Circle circ = new Circle(3.0);
        Triangle tri = new Triangle(3.4, 2.7, 5.2);

        Shape[] ShapeArray = new Shape[3];
        ShapeArray[0] = rect;
        ShapeArray[1] = circ;
        ShapeArray[2] = tri;

        for(int i = 0; i < ShapeArray.length; i++){
            ShapeArray[i].toString();
        }

    }
}