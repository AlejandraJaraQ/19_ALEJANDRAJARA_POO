/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06_alejandrajara;

/**
 *
 * @author aleja
 */
public class Estudiante_19 {
    // Atributos
    private String nombre;
    private int edad;

    // Constructores sobrecargados
    public Estudiante_19() {
        nombre = "";
        edad = 0;
    }

    public Estudiante_19(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    public void estudiar(int horas) {
        System.out.println(nombre + " está estudiando durante " + horas + " horas.");
    }

    // Método con valor de retorno
    public String getNombre() {
        return nombre;
    }

    // Sobrecarga de método 
    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }

    public void saludar(String saludo) {
        System.out.println(saludo + ", soy " + nombre);
    }
}
