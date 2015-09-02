import java.awt.Color;
import java.util.Random;

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
        Random generator = new Random();
        for(int i=1; i<100; i++){
            int turn1 = generator.nextInt(360);
            int turn2 = generator.nextInt(360);
            int d1 = generator.nextInt(200);
            int d2 = generator.nextInt(200);
            t1.turn(turn1);
            t2.turn(turn2);
            t1.forward(d1);
            t2.forward(d2);
         }
    }
}