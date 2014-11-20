import TurtleGraphics.Pen;

abstract public class AbstractShape implements Shape
{
  protected double  xpos,ypos,perimeter;
  
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
  
  public final double getYpos()
  {
      return xpos;           
  }
  
  public final double getXpos()
  {
      return ypos;
  }
  
    public final void move(double xloc, double yloc)
    {
        xpos=xloc;
        ypos=yloc;  
    }
    
    public final double Perimeter()
    {
        return perimeter;
    }
    public String toString()
    {
        String str="X-Y Position=" + xpos + "," + ypos;
        str+= "\nArea=" + area();
        str+="\nPerimeter=" + Perimeter();
        return str;
    }
     
}
