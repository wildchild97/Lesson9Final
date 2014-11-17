import TurtleGraphics.Pen;

public class Wheel extends Circle {
    private int spokes;
    
    public Wheel()
    {
        super();
        //activates constructor cirle() to initalize xpos, ypos & radius
        spokes=0;
    }
    
    public Wheel(double xloc, double yloc, double r, int s)
    {
        super (xloc, yloc, r);
        //activates constructor to initalize xpos, ypos, r
        spokes=s;  
    }
    
    public void draw(Pen p)
    {
        //draw wheel rim by calling draw method
        super.draw(p);
        
        //draw spokes
        for (int i=1;i<=spokes; i++)
        {
            p.up();
            p.move(xpos,ypos);
            p.setDirection(i*360/spokes);
            p.down();
            p.move(radius);
        }
    }
    
    public void setSpokes(int s)
    {
        spokes=s;
    }
    
    public String toString()
    {
        String str="Wheel\n" + "Radius: " +radius + "\n" + "Spokes: " + spokes + "\n" + "(X,Y) Position: ("+ xpos + ","+ ypos+ ")\n" + "Area: " + area();
        return str;         
    }
}
