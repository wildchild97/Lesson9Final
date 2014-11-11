
import TurtleGraphics.Pen;


public class Rect implements Shape{
    
    private double xpos, ypos, width, height;

    public Rect()
    {
        xpos=0;
        ypos=0;
        width=1;
        height=1;
    }
    
    public Rect (double x, double y, double w, double h)
    {
        xpos=x;
        ypos=y;
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
        p.turn(90);
        p.move(height);
        p.turn(90);
        p.move(width);
        p.turn(90);
        p.move(height);
    }

    
    public double xpos() {
        return xpos;
    }

    
    public double ypos() {
        return ypos;
    }

    
    public void move(double xloc, double yloc) {
        xpos=xloc;
        ypos=yloc;
    }

   
    public void stretchyBy(double factor) {
        height*=factor;
        width*=factor;
                
    }
    
    public String toString()
    {
        String str="This is a RECTANGLE\n";
        str+="XLOC: " + xpos + "\tYLOC: " + ypos + "\n";
        str+="WIDTH: " + width + "\tHEIGHT" + height + "\n";
        str+="Area: " + area();
        return str;
    }
    
}
