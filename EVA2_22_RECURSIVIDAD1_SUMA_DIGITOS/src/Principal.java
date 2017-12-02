/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16550542
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=126;
        System.out.println("La suma de los digitos " + x + " es " + suma(x) );
        
    }
    public static int  suma(int x){
        if(x==0){
            return x;
        }else{
            return suma(x/10)+(x%10);
        }
    } 
}    
