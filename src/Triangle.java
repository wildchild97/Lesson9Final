import TurtleGraphics.Pen;

public class Triangle extends AbstractShape{
     private double x2,y2,x3,y3,xd,yd;
    
    public Triangle()
    {
        super();
        x2=50;
        y2=50;
        x3=-50;
        y3=-50;
        xd=0;
        yd=0;
    }
    
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
    
    public void move(double xloc, double yloc)
    {
        xd=xloc-xpos;
        yd=yloc-ypos;
        
        xpos=xloc;
        ypos=yloc;
        x2+=xd;
        y2+=yd;
        x3+=xd;
        y3+=yd;
               
    }

    public double Perimeter()
    {
     return Math.sqrt((xpos-x2)*(xpos-x2)+(ypos-y2)*(ypos-y2));
    }
   
   
    public void stretchBy(double factor)
    {
       x2=(x2-xpos)*factor + xpos;
       y2=(y2-ypos)*factor + ypos;
       x3=(x3-xpos)*factor + xpos;
       y3=(y3-ypos)*factor + ypos;
    }
    
     public String toString()
    {
        String result="This is a Triangle\n";
        result+="\n"+ super.toString();
        return result;
    }
}
