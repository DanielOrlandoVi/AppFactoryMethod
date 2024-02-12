
package ProductoConcreto;

import Producto.Alimento;

public class Hamburguesa implements Alimento{
    
    @Override
    public String getIngredientes(){
        return "La hamburguesa esta hecha de pan, carne, lechuga, queso, cebolla y salsas";
    }
}
