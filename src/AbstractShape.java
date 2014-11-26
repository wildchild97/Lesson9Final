import TurtleGraphics.Pen;

public abstract class AbstractShape implements Shape
{
  protected double  xpos,ypos;
  
  public AbstractShape()
  {
      xpos=0;
      ypos=0;
  }
  
  public AbstractShape(double x, double y)
  {
      xpos=x;
      ypos=y;
  }
  
 public abstract double Perimeter();
 
  public final double getYpos()
  {
      return xpos;           
  }
  
  public final double getXpos()
  {
      return ypos;
  }
  
    public void move(double xloc, double yloc)
    {
        xpos=xloc;
        ypos=yloc;  
    }
    
   
    public String toString()
    {
        String str="X-Y Position=" + xpos + "," + ypos;
        str+= "\nArea=" + area();
        str+="\nPerimeter=" + Perimeter();
        return str;
    }
     
}
