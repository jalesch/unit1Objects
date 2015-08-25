// public class HelloPrinter
// {
//     public static void main(String[] args)
//     {
//         //Display a greeting in the console window
//         System.out.println("Hello, World!");
//     }
// }
// 
// import javax.swing.JOptionPane;
// public class DialogViewer
// {
//     public static void main(String[] args)
//     {
//         String name = JOptionPane.showInputDialog("What is your name");
//         System.out.println("Hello "+name);
//     }
// }

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://www.naperville203.org/cms/lib07/IL01904881/Centricity/Template/GlobalAssets/images///logos/wolf.jpg");
        JOptionPane.showMessageDialog(null, "NNHS", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }
    }
    