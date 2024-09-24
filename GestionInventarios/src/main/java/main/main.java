
package main;

import grafico.PantallaLogin;

/**
 *
 * @author asus
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UsuarioRepositorio ejemplo = new UsuarioRepositorio();
        
        ejemplo.crearUsuario(0, "Alejandro", "Uribe", "cc", "1088313262", "manzana 29", "3216193593", true, "alejo@gmail.com", "123");
        ejemplo.crearUsuario(1, "Andrea", "Valor", "cc", "1088313262", "manzana 29", "3216193593", true, "andrea@gmail.com", "234");
        ejemplo.crearUsuario(2, "Juan", "Uribe", "cc", "1088313262", "manzana 29", "3216193593", true, "juan@gmail.com", "345");
        ejemplo.crearUsuario(3, "Juan Jose", "Uribe", "cc", "1088313262", "manzana 29", "3216193593", true, "juanjo@gmail.com", "456");
        PantallaLogin panta = new PantallaLogin();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
       
                
        
    }
    
    
    
    
    
}
