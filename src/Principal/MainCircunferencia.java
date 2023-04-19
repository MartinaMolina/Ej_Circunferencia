
package Principal;

import Circulo.Circunferencia;

public class MainCircunferencia {

    public static void main(String[] args) {
        
        Circunferencia circulo = new Circunferencia();
        
        circulo.crearCircunferencia();
        
        circulo.area();
        
        circulo.perimetro();
        
        System.out.println(circulo.mostrarDatos());
        
    }
    
}
