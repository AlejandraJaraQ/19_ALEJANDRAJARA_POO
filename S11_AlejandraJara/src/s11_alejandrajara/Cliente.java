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
public class Cliente extends Persona {
    private int numeroCliente;

    public Cliente(String nombre, int edad, int numeroCliente) {
        super(nombre, edad);
        this.numeroCliente = numeroCliente;
    }

    public void comprar() {
        System.out.println(nombre + " es el cliente número " + numeroCliente + " y está comprando");
    }

    public void mostrarNumeroCliente() {
        System.out.println("Número de Cliente: " + numeroCliente);
    }
}
