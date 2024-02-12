
package ProductoConcreto;

import Producto.Alimento;

public class Pizza implements Alimento{
    
    @Override
    public String getIngredientes(){
        return "La pizza esta hecha de masa, salsa, queso, peperoni y trozos de carne";
    }
    
}
