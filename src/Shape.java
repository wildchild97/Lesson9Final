import TurtleGraphics.*;

public interface Shape {
    public double area();
    public void draw(Pen p);
    public double Xpos();
    public double Ypos();
    public void move(double xloc, double yloc);
    public void stretchyBy(double factor);
    public String toString();
}
