
import TurtleGraphics.Pen;


public class Circle extends AbstractShape{
   
    protected double radius;

    public Circle()
    {
       super();
        radius=1;
    }
    
    public Circle (double x, double y, double r)
    {
        super(x,y);
        radius=r;          
    }
    public double area() {
       return radius*radius*Math.PI; 
    }

    
    public void draw(Pen p) {
        double side=2*Math.PI* radius/120;
        p.up();
        p.move(xpos+radius, ypos-side/2);
        p.setDirection(90);
        p.down();
        
        for (int i=0; 1<120; i++)
        {
            p.move(side);
            p.turn(3);
        }    
    }

   
    public String toString()
    {
        String result="This is a CIRCLE\n";
        result+="Radius: " + radius;
        result+="\n " + super.toString();
        return result;
    }
    
}
