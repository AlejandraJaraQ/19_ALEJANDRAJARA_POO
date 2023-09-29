/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_19;
import javax.swing.JOptionPane;
/**
 *
 * @author aleja
 */
public class estudiante_19 {
    String nombre;
    int edad;
    String curso;
    
    public void estudiante(){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        curso = JOptionPane.showInputDialog("Ingrese el curso del estudiante:");
    }
    public void mostrar(){
                JOptionPane.showMessageDialog(null, "Información del estudiante:\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Curso: " + curso);
    }
}
