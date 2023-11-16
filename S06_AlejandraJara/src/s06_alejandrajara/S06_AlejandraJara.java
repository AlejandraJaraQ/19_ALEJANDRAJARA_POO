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
public class S06_AlejandraJara {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Estudiante_19 estudiante1 = new Estudiante_19();
        Estudiante_19 estudiante2 = new Estudiante_19("Edgar", 21);

        estudiante1.estudiar();
        estudiante2.estudiar(3);

        estudiante1.saludar();
        estudiante2.saludar("Buenos días");
    }
}
