import TerminalIO.*;
import TurtleGraphics.*;


public class ShapeMaker {

    public static void main(String[] args) {
        Shape sl;
        Pen p= new StandardPen();
        double r,x,y;
        double w,h;
        int choice;
        KeyboardReader k= new KeyboardReader();
        
        //pick circle or rectangle
        while(true)
        {
            choice=k.readInt("Enter 1 for Rectangle, or 2 for Circle: ");
            if (choice==1 || choice==2) break;
        }
        if (choice==1)
        {
            w=k.readDouble("Enter width of Rectangle");
            h=k.readDouble("Enter the height of Rectangle");
            sl=new Rect (0,0,w,h);
        }
        else
        {
            r=k.readDouble ("Enter radius of Circle");
            sl=new Circle(0,0,r);
        }
        
        while(true)
        {
            sl.draw(p);
            x=k.readDouble("New x: ");
            y=k.readDouble("New y: ");
            
            //erase and move
            
            p.setColor(Color.white);
            sl.draw(p);
            
        }
        
    }
    
}
