
package Video15Entrada2Kev;

import java.util.*;
import javax.swing.JOptionPane;

public class Entrada2 {
    
    public void raizJPane(){
        //para sacar raiz cuadrada con una ventana de dialogo
        
        String num1 = JOptionPane.showInputDialog("Introduce un numero (para raiz)");
        
        double num2 = Double.parseDouble(num1);
        
        System.out.print("Raiz de " + num1 + " es: ");
        
                            //???
        System.out.printf("%1.1f", Math.sqrt(num2));
        
    }
}
