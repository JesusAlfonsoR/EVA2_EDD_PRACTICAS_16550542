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
        //IMPRIMIR LOS NUMEROS DEL 5 AL 1
        for (int i = 5; i >=1; i--) {
            System.out.println("i = " + i);
        }
   Falso_For(10);
   Falso_ForUp(1,5);
    }
    public static void Falso_For(int iVal){//FUNCION DEL METODOO RECURSIVO:IMPRIMIR NUMEROS
        System.out.print(" i = " + iVal);
        if(iVal>1){//MIENTRAS SEA MAYOR A UNO LA RECURSIVIDAD SIGUE
            
        
        Falso_For(iVal-1); //CONTROLAR RECURSIVIDAD
        } 
    }
        public static void Falso_ForUp(int iIni, int iFin){
            System.out.println(iIni +" = ");
            if(iIni<iFin){
                Falso_ForUp(iIni+1,iFin);
            }
        }
   
}
