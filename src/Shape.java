import TurtleGraphics.*;

public interface Shape {
    public double area();
    public void draw(Pen p);
    public double getXpos();
    public double getYpos();
    public void move(double xloc, double yloc);
    public void stretchBy(double factor);
    public String toString();
}
