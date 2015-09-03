import java.awt.Color;
import java.util.Random;
//This is what my two year old would draw :)
public class Turtles
{
    public static void main( String[] args )
    {
        World turtleWorld = new World();
        Turtle t1 = new Turtle(turtleWorld);
        Turtle t2 = new Turtle(turtleWorld);
        t1.setPenColor(Color.BLUE);
        t2.setPenColor(Color.ORANGE);
        t1.hide();
        t2.hide();
        t1.penUp();
        t2.penUp();
        t1.forward(100);
        t2.turnRight();
        t2.forward(100);
        t1.penDown();
        t2.penDown();
        Random generator = new Random();
  

        for(int i=1; i<360; i++){
            int turn1 = 10;
            int d1 = 10;
            t1.turn(turn1);
            t2.turn(turn1);
            t1.forward(d1);
            t2.forward(d1);
         }
    }
}