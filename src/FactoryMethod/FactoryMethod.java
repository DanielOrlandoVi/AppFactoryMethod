
package FactoryMethod;
import Vista.Menu;

public class FactoryMethod {


    public static void main(String[] args) {
        Menu menu = new Menu();
        
        while(1 != 0){
        menu.mostrar_Menu();
        menu.mostrardatos();
        }
    }
    
}
