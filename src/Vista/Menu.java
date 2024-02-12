
package Vista;

import javax.swing.JOptionPane;
import ProductoConcreto.Hamburguesa;
import ProductoConcreto.Pizza;

public class Menu {
    int opcion;
    
    public int mostrar_Menu(){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido al restaurante de comida rápida!" 
                + "\n" + "Seleccione el alimento que desea llevar" + "\n" +
                "1. Hamburguesa" + "\n" + "2.Pizza" + "\n" + "3. Salir"));
        return opcion;
    }
    
    public void mostrardatos(){
        Pizza pizza = new Pizza();
        Hamburguesa hamburguesa = new Hamburguesa();
        
        if (opcion == 1){
            JOptionPane.showMessageDialog(null, hamburguesa.getIngredientes());
        }
        if (opcion == 2){
            JOptionPane.showMessageDialog(null, pizza.getIngredientes());
        }
        if (opcion == 3){
            System.exit(0);
        }
        
 
    }
    
    
}
