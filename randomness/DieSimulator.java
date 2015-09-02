import java.util.Random;

public class DieSimulator
{
    public static void main( String[] args )
    {
        Random generator = new Random();
        int dieValue = generator.nextInt(6)+1;
        
        
        System.out.println(dieValue);
        
        // Option B Static methods with Mass class
        double dieValue2 = Math.random();
        dieValue2 *= 6;
        dieValue2 += 1;
        
                             //cast
        System.out.println( (int) dieValue2 );
        
    }
}
