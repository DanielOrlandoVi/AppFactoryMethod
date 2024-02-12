
package FabricaConcreta;
import Fabrica.FabricaAlimento;
import Producto.Alimento;
import ProductoConcreto.Pizza;

public class FabricaPizza extends FabricaAlimento {
    
    @Override
    public Alimento crearAlimento() {
        return new Pizza();
    }
}
