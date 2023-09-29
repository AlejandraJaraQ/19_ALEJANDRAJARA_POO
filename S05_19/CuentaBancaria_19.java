/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_19;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class CuentaBancaria_19 {
String nombre;
 int dinero;
 
 public void orden(){
             System.out.println(nombre + "deposito con exito");
    }
    
       public void preguntar() {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese un nombre (nombre): ");
        nombre = scanner.next();
        System.out.print("Ingrese una cantidad de dinero (dinero: ");
        dinero = scanner.nextInt();
    }
    }
}
    

