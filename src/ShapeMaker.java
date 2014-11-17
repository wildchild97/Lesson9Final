public class ShapeMaker {

    public static void main(String[] args) {
       Rect rect;
       Shape shape1, shape2, shape3;
       rect=new Rect(1,1,4,6);
       
       shape1= makeOneShapeFromAnother (rect, "circle");
       shape2= makeOneShapeFromAnother (rect, "rectangle");
       shape3= makeOneShapeFromAnother (rect, "wheel");
       
       System.out.println("\nRectangle Area: " + rect.area() + "\nCircle Area: " + shape1.area() + "\nRectangle Area: " + shape2.area() + "\nWheel Area: " + shape3.area());

     }
    static private shape makeOneShapeFromAnother (Shape inShape, String type)
    {
        
    }
}
