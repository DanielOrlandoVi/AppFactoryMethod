
package Vista;

import javax.swing.JOptionPane;
import ProductoConcreto.Hamburguesa;
import ProductoConcreto.Pizza;

public class Menu {
    int opcion;
    
    public int mostrar_Menu(){
        String opcion_texto = JOptionPane.showInputDialog("¡Bienvenido al restaurante de comida rápida!" 
                + "\n" + "Seleccione el alimento que desea llevar" + "\n" +
                "1. Hamburguesa" + "\n" + "2.Pizza" + "\n" + "3. Salir");
        if (opcion_texto == null) {
        	System.exit(0);
        }
        try {
        opcion = Integer.parseInt(opcion_texto);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return mostrar_Menu();
        }
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
        else {
        	JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            mostrar_Menu();
        }
        
 
    }
    
    
}
