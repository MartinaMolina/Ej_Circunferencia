
package Circulo;

import java.util.Scanner;

public class Circunferencia {

    // ATRIBUTOS
    
    private double radio, area, perimetro, circunferencia;
    private final double pi = 3.14;

    // CONSTRUCTOR
    
    public Circunferencia() {
    }

    // GETTER & SETTER
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // METODOS
    
    public void crearCircunferencia () {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        System.out.println("Por favor, ingrese el radio");
        setRadio(leer.nextDouble());
        
        circunferencia = radio * 2;
    }
    
    public void area() {
       area = pi * radio * radio;
    }
    
    public void perimetro () {
       perimetro = 2 * pi * radio;
    }
    
    public String mostrarDatos () {
        return "La circunferencia del circulo es de " + Math.round(circunferencia) + " cm, su area mide " + Math.round(area) + " cm, y su perimetro es de " + Math.round(perimetro) + " cm";
    }
}
