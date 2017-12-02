/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    static int iCont=0;
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Fibo de " + Fibonnaci(9));
        for (int i = 0; i < 10; i++) {
            System.out.println(Fibonnaci(i)  );
        }
    }
    public static int Fibonnaci(int iPos){
      iCont++;
        System.out.println(iCont);//Contador para ver la cantidad de veces que se llama a la recursividad
       if(iPos==0){
           return 0;
       }else if(iPos==1){
           return 1;
       }else 
           return Fibonnaci(iPos-1)+Fibonnaci(iPos - 2);
        
    }
}
