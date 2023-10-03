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
public class Main_S07_19 {

public static void main(String[] args) {
        Persona1_19 persona4 = new Persona1_19("Anderson", 21);
        persona4.saludar("Bienvenido");
    }
    static {
        Persona2_19 persona5 = new Persona2_19("María", 25);
        System.out.println("Nombre: " + persona5.getNombre());
        System.out.println("Edad: " + persona5.getEdad());
        persona5.setNombre("Lucía");
        persona5.setEdad(25);
        System.out.println("Nuevo nombre: " + persona5.getNombre());
        System.out.println("Nueva edad: " + persona5.getEdad());
    }
}
