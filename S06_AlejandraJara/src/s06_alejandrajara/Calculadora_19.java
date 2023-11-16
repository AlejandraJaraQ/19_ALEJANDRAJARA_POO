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
public class Calculadora_19 {
    // Atributos
    private int num1;
    private int num2;
    private int resultado;

    // Constructor sin parámetros
    public Calculadora_19() {
        this.num1 = 0;
        this.num2 = 0;
        this.resultado = 0;
    }

    // Constructor con parámetros
    public Calculadora_19(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = 0;
    }

    // Método para sumar
    public int sumar() {
        resultado = num1 + num2;
        return resultado;
    }

    // Método para restar
    public int restar() {
        resultado = num1 - num2;
        return resultado;
    }

    // Método para multiplicar
    public int multiplicar() {
        resultado = num1 * num2;
        return resultado;
    }

    // Método para dividir
    public double dividir() {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN; 
        }
    }

    // Método para obtener el resultado actual
    public int getResultado() {
        return resultado;
    }
}