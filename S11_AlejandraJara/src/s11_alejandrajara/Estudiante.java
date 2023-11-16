/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11_alejandrajara;

/**
 *
 * @author aleja
 */
public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando en el curso de " + curso);
    }

    public void mostrarCurso() {
        System.out.println("Curso: " + curso);
    }
}
