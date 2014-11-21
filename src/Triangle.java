import TurtleGraphics.Pen;

public class Triangle extends AbstractShape{
     private double base,height,x1,y1,x2,y2;
    
    
    
    public double area() 
    {
        return (base*height)/2;
    }

    public void draw(Pen p) 
    {
        p.up();
        p.move(xpos,ypos);
        p.down();
        p.move(x1,y1);
        p.move(x2,y2);
        p.move(xpos,ypos);
    }

    @Override
    public double xpos() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double ypos()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
