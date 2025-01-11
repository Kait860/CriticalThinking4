public class ShapeArray {
    public static void main(String[] args) throws Exception {
        //initialize shape values
        Rectangle rect = new Rectangle(5.0,8.0);
        Circle circ = new Circle(3.0);
        Triangle tri = new Triangle(3.4, 2.7, 5.2);

        Shape[] ShapeArray = new Shape[3];
        ShapeArray[0] = rect;
        ShapeArray[1] = circ;
        ShapeArray[2] = tri;

        for (Shape ShapeArray1 : ShapeArray) {
            ShapeArray1.toString();
        }
    }
}