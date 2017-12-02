/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial de 5 = " + Factorial(5));
    }
    public static int Factorial(int iVal){
        if(iVal>0){
            return iVal * Factorial(iVal-1);
        }else { //SI ES MENOR A CERO ES 1
            return 1;
        }
    }
}
