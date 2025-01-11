public class ShapeArray {
    public static void main(String[] args) {
        //initialize shape values
        Rectangle rect = new Rectangle(5.0,8.0);
        Circle circ = new Circle(3.0);
        Triangle tri = new Triangle(3.4, 2.7, 5.2);
        
        //add shapes to ShapeArray
        Shape[] ShapeArray = new Shape[3];
        ShapeArray[0] = rect;
        ShapeArray[1] = circ;
        ShapeArray[2] = tri;

        //loop through shapes using their individual toString() methods
        for(int i = 0 ; i < ShapeArray.length; i++) {
            System.out.println(ShapeArray[i].toString());
        }
    }
}