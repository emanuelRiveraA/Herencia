/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Idalia
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v = new Vehiculo();
        v.setX(20);
        
        Carro c = new Carro();
        
        c.setX(63);
        
        System.out.println("x "+c.getX());
    }
    
}
