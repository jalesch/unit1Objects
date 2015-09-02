import java.awt.Color;

public class Turtles
{
    public static void main( String[] args )
    {
        World turtleWorld = new World();
        Turtle t1 = new Turtle(turtleWorld);
        Turtle t2 = new Turtle(turtleWorld);
        t1.setPenColor(Color.BLUE);
        t2.setPenColor(Color.ORANGE);
        t1.penDown();
        t2.penDown();
        t1.forward(100);
        t2.turnRight();
        t2.forward(100);
    }
}