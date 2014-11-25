import TurtleGraphics.Pen;

public class Triangle extends AbstractShape{
     private double base,height,x2,y2,x3,y3;
    
    
    
    public double area() 
    {
       return Math.abs((xpos*y2-x2*ypos) + (x2*y3-x3*y2) + (x3*ypos-xpos*y3))/2;
    }

    public void draw(Pen p) 
    {
        p.up();
        p.move(xpos,ypos);
        p.down();
        p.move(x2,y2);
        p.move(x3,y3);
        p.move(xpos,ypos);
    }

    public void Perimeter()
    {
        x2=(x2-xpos)*factor + xpos
    }
   
    @Override
    public void stretchBy(double factor)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public String toString()
    {
        String result="This is a Triangle\n";
        result+="Base: " + base + "\tHeight" + height + "\n";
        result+="\n"+ super.toString();
        return result;
    }
}
