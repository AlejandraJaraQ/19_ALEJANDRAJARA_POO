/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07v2_19;

public class Main_S07v2_19 {
    
    public static void main(String[] args) {
        // Crear dos objetos de Persona
        Persona_19 persona1 = new Persona_19("Anderson", 30, 1.75);
        Persona_19 persona2 = new Persona_19("María", 25, 1.65);

        // Llamar a métodos de objeto persona1
        persona1.saludar();
        persona1.saludar("Bienvenido ");
        persona1.saludar(3);
        persona1.cambiarNombre("Luis");

        // Llamar a métodos de objeto persona2
        persona2.saludar();
        persona2.saludar(2);
        persona2.celebrarCumpleaños(1);

        // Obtener valores de retorno de objetos persona1 y persona2
        int edadPersona1 = persona1.obtenerEdad();
        double alturaPersona2 = persona2.obtenerAltura();

        System.out.println(persona1.getNombre() + " tiene " + edadPersona1 + " años.");
        System.out.println(persona2.getNombre() + " tiene una altura de " + alturaPersona2 + " metros.");
    }
}