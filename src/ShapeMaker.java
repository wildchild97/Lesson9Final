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
    static private Shape makeOneShapeFromAnother (Shape inShape, String type)
    {
        Shape outShape;
        double area,radius,width,height;
        double x=inShape.xpos();
        double y=inShape.ypos();
        area=inShape.area();
        
        if(type.equals("circle"))
        {
            radius=Math.sqrt(area/Math.PI);
            outShape=new Circle(x,y,radius);
        }
        else if(type.equals("rectangle"))
        {
            width=height=Math.sqrt (area);
            outShape=new Rect (x,y,width,height);
        }
        else
        {
            radius=Math.sqrt(area/Math.PI);
            outShape=new Wheel(x,y,radius,6);
        }
        return outShape;
    }
}
