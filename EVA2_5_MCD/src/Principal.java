/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16550542 Maximo comun divisor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El Minimo comun divisor de 180,48 " + MCD(180,48));
    }
    
    
    public static int MCD(int a,int b){
        
       if(b== 0){
           return a;
       }else{
           return MCD(b,a%b);
           
       }
    }
}
