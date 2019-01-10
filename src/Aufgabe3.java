import javax.swing.*;
import java.util.InvalidPropertiesFormatException;

public class Aufgabe3
{
    public static void main(String[] args) throws Exception
    {
       try
       {
           String a = JOptionPane.showInputDialog("geben sie eine positive Zahl ohne Kommastelle ein");
           if (a.contains(",") || a.contains(".")) {
               throw new Exception();
           }
           int b= Integer.parseInt(a);
           String c = JOptionPane.showInputDialog("gem sie einen zehnstelling String eine");
           if (c.length()!=10)
           {
               throw new Exception();
           }
           String d = JOptionPane.showInputDialog("gem sie en 2stellig tring eine");
           if (d.length()!=2)
           {
               throw new Exception();
           }
           String e = JOptionPane.showInputDialog("Schreiben sie:Ich bin ein Loser");
           {
               if (!e.equals("Ich bin ein Loser"))
               {
                   throw new Exception();
               }
           }
           String f= JOptionPane.showInputDialog(" gebens  eine Zoi ein");
           Integer.parseInt(f);
       }
       catch (Exception e)
       {
           System.err.println("HAST DU EIN PROBLEM ? ICH WEISS WO DU WOHNST , IICH KENN DEINE IP, ICH KOMME FUR DICH");
       }
    }
}




