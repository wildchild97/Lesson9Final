
import TurtleGraphics.Pen;


public class Rect extends AbstractShape{
    
    private double width, height, perimeter;

    public Rect()
    {
       super();
        width=1;
        height=1;
    }
    
    public Rect (double x, double y, double w, double h)
    {
        super();
        width=w; 
        height=h;
    }
    
    public double area() {
        return width*height;
    }

   
    public void draw(Pen p) {
        p.up();
        p.move(xpos,ypos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }

   
    public void stretchBy(double factor) {
        height*=factor;
        width*=factor;
                
    }
    
     public double Perimeter()
    {
        return width*height;
        
    }
    
    public String toString()
    {
        String result="This is a Rectangle\n";
        result+="Width: " + width + "\tHeight" + height + "\n";
        result+="\n"+ super.toString();
        return result;
    }
    
}
