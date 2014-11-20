import TurtleGraphics.*;

public interface Shape {
    public double area();
    public void draw(Pen p);
    public double xpos();
    public double ypos();
    public void move(double xloc, double yloc);
    public void stretchBy(double factor);
    public String toString();
}
