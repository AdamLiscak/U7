import javax.swing.*;
import java.util.IllegalFormatWidthException;


public class AufgabeZwei {
    public static void main(String[] args)
    {
        try
        {
            String a = JOptionPane.showInputDialog("bitte zahl eingem ");
            String b = JOptionPane.showInputDialog("bitte zahl eingem ");
            int c = Integer.parseInt(a);
            double d = Integer.parseInt(b);
            System.out.println(c/d);
        }
        catch (NumberFormatException | ArithmeticException |IllegalFormatWidthException | IllegalStateException  e)
        {
            System.err.println("blablabla");
        }
    }
}
