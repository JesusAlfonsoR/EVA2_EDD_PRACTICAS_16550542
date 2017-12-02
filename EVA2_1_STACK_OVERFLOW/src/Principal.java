/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16550542
 * RECURSIVITY
 * SI NO SE DETIENE LA RECURSIVIDAD SE ACABA EL STACK
 */ 
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stackOverFlowRecursivo();
    }
    public static void stackOverFlowRecursivo(){
        System.out.println("supp"); //Para que sea un metodo recursivo se debde llamar asi mismo
        stackOverFlowRecursivo();
    }
}
