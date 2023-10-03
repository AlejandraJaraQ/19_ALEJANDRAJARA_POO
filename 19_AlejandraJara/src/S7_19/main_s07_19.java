/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S7_19;

/**
 *
 * @author aleja
 */
public class main_s07_19 {

public static void main(String[] args) {
        Persona1 persona4 = new Persona1("Anderson", 21);
        persona4.saludar("Bienvenido");
    }
    static {
        Persona2 persona5 = new Persona2("María", 25);
        System.out.println("Nombre: " + persona5.getNombre());
        System.out.println("Edad: " + persona5.getEdad());
        persona5.setNombre("Lucía");
        persona5.setEdad(25);
        System.out.println("Nuevo nombre: " + persona5.getNombre());
        System.out.println("Nueva edad: " + persona5.getEdad());
    }
}
