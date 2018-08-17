
package Video15Entrada2Kev;

import java.util.*;
import javax.swing.JOptionPane;

public class Entrada {
    //se ingresaran los datos con j pane
    public void mensaje(){
        
        //String nombre; lo declarare de una vez
        
        String nombre = JOptionPane.showInputDialog("Tu nombre");
        
        String edad;
        
        edad = JOptionPane.showInputDialog("Tu edad:");
        
        int edad2 = Integer.parseInt(edad);
        
        edad2++; //para aumentar en un año
        
       System.out.println("Hola " + nombre + "Tienes "+ edad+ " y " + " El proximo año tendras " + edad2 + " años");
        
    }
    
}
