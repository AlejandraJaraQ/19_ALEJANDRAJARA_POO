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
public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando y gana $" + salario);
    }

    public void mostrarSalario() {
        System.out.println("Salario: $" + salario);
    }
}
