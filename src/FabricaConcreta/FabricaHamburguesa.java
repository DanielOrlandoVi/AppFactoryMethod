
package FabricaConcreta;
import Fabrica.FabricaAlimento;
import Producto.Alimento;
import ProductoConcreto.Hamburguesa;

public class FabricaHamburguesa extends FabricaAlimento{

    
    @Override
    public Alimento crearAlimento() {
        return new Hamburguesa();
    }
    

}
