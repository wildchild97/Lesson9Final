import TurtleGraphics.Pen;

abstract public class AbstractShape 
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
  
  public final double getXpos()
  {
      return xpos;           
  }
  
  public final double getYpos()
  {
      return ypos;
  }
  
    public final void move(double xloc, double yloc)
    {
        xpos=xloc;
        ypos=yloc;  
    }
    
    public String toString()
    {
        String str="X-Y Position=" + xpos + "," + ypos;
        str+= "\nArea=" + area();
        return str;
    }
     
    
}
