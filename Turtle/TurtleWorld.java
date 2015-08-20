import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle.forward(50);
        turtle.penUp();
        turtle.forward(100);
        turtle.setPenWidth(10);
        turtle.penDown();
        turtle.turnRight();
        turtle.forward(50);
    }
}
