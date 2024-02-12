
package FabricaConcreta;
import FabricaAbstracta.FabricaAlimento;
import ProductoConcreto.Alimento;
import ProductoConcreto.Hamburguesa;

public class FabricaHamburguesa extends FabricaAlimento{

    
    @Override
    public Alimento crearAlimento() {
        return new Hamburguesa();
    }
    

}
