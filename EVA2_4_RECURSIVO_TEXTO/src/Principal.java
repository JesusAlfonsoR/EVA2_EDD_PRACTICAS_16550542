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
        
        for (int i = 1; i <= 10; i++) {//I=CANTIDAD DE ASTERICOS QUE SE VAN A IMPRIMIR
            System.out.println(cadenaRecursiva(i));
        }
        for (int i = 9; i >= 1; i--) {//I=CANTIDAD DE ASTERICOS QUE SE VAN A IMPRIMIR
            System.out.println(cadenaRecursiva(i));
        }
        
        
    }
    public static String cadenaRecursiva(int iNum){
        if(iNum>1){
            
           return "*"+cadenaRecursiva(iNum-1);
        }else{
            return "*";
        }
    }
    
}
