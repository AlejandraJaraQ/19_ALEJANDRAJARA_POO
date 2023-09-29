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
public class Libro_19 {
   String titulo;
    String autor;
    int numlibros;

    public void harry() {
        titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        numlibros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de libros:"));
    }

    public void mostrarlibro() {
        JOptionPane.showMessageDialog(null, "Información del libro:\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Número de libros: " + numlibros);
    } 
}
