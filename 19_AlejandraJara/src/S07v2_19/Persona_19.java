/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07v2_19;

/**
 *
 * @author aleja
 */
public class Persona_19 {
    private String nombre;
    private int edad;
    private double altura;

    public Persona_19(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
    public void saludar(String mensaje) {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años. " + mensaje);
    }
    public void saludar(int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
        }
    }

    public int obtenerEdad() {
        return edad;
    }
    public double obtenerAltura() {
        return altura;
    }
    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    public void celebrarCumpleaños(int años) {
        edad += años;
    }    

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
