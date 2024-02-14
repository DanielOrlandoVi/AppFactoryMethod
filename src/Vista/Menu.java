
package Vista;

import javax.swing.JOptionPane;
import FabricaConcreta.FabricaHamburguesa;
import FabricaConcreta.FabricaPizza;
import ProductoConcreto.Pizza;
import ProductoConcreto.Hamburguesa;
import Producto.Alimento;


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
    	FabricaPizza fabricapizza = new FabricaPizza();
    	FabricaHamburguesa fabricahamburguesa = new FabricaHamburguesa();
    	Alimento pizza = fabricapizza.crearAlimento();
    	Alimento hamburguesa = fabricahamburguesa.crearAlimento();

        
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
