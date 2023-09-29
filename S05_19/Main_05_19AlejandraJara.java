/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_19;

/**
 *
 * @author aleja
 */
public class Main_05_19AlejandraJara {
    
    
        public static void main(String[] args) {
     estudiante_19 estudiante1 = new estudiante_19();
       estudiante1.estudiante();
       estudiante1.mostrar();
    }
    
static {
     Libro_19 libro1 = new Libro_19();
       libro1.harry();
       libro1.mostrarlibro();
    }
static {
      CuentaBancaria_19 cuenta = new CuentaBancaria_19();

        cuenta.preguntar();
        cuenta.orden();
    }
static {
        Auto_19 auto = new Auto_19();
        auto.acelerar();
    }
}
