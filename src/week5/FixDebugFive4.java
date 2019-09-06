package week5;// FixDebugFive4.java
// Outputs highest of four numbers
import javax.swing.*;
public class FixDebugFive4
{
   public static void main (String args[]) 
   {
      int one, two, three, four;
      String str, str1, str2,str3, output;
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      one = Integer.parseInt(str);
      str1 = JOptionPane.showInputDialog(null,"Enter an integer");
      two = Integer.parseInt(str1);
      str2 = JOptionPane.showInputDialog(null,"Enter an integer");
      three = Integer.parseInt(str2);
      str3 = JOptionPane.showInputDialog(null,"Enter an integer");
      four = Integer.parseInt(str3);
      if(one > two & one > three && one > four)
         output = "Highest is " + one;
      else
         if(two > one && two > three && two > four)
            output = "Highest is " + two;
         else
           if(three > one && three > two && three > four)
              output = "Highest is " + three;
           else
              output = "Highest is " + four;
      JOptionPane.showMessageDialog(null, output);
   }
}


