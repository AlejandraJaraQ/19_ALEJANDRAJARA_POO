/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_19;

/**
 *
 * @author aleja
 */
public class Persona1_19 {
     private String nombre;
    private int edad;
    public Persona1_19(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void saludar(String mensaje) {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años. " + mensaje);
    }   
}
