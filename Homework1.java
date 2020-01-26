
package homework1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Homework1 {

    public static void main(String[] args) {
         JFrame frame = new JFrame();
       String A;
      int i;
      A = JOptionPane.showInputDialog(null, "Enter an integer: ");
      i=Integer.parseInt(A);
      if(i%2==0)
         JOptionPane.showMessageDialog(null, "that Number is even " + i);
      else
         JOptionPane.showMessageDialog(null, "that Number is odd " + i);
      int result = JOptionPane.showConfirmDialog(frame, "Do Another?");
      	
    System.exit(0);
    }
    
}
