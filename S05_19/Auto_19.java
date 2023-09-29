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
public class Auto_19 {
    String marca;
    String color;
    int km;

    public void acelerar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la marca del auto: ");
            marca = scanner.nextLine();
            
            System.out.print("Ingrese el color del auto: ");
            color = scanner.nextLine();
        }

        System.out.println("El auto de marca " + marca + " y color " + color + " acelera.");
    }   
}
