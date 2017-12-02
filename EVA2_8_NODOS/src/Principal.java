/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16550542 LISTA ENLAZADAS
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo nObj= new Nodo();
        nObj.iVal=100;
        
        Nodo nObj2= new Nodo();
        nObj2.iVal=300;
        
        Nodo nObj3= new Nodo();
        nObj3.iVal=500;
        //VINCULAR NODOS
        //obj1 ----> obj2
        nObj .nsig= nObj2;//HEY EL OBJETO DOS ESTA AHI GUARDALO EN EL SIG
        nObj2.nsig= nObj3;
        //System.out.println(nObj.iVal);
        //System.out.println(nObj2.iVal);
        //System.out.println(nObj3.iVal);
        Nodo nMover=nObj;
        while(nMover !=null){//Mientras sea diferente de nulo se ejecuta
           System.out.println(nMover.iVal);
            nMover= nMover.nsig;
            
        }
    }
    
}
class Nodo{
    public int iVal;
    public Nodo nsig;
public Nodo(){
    nsig= null;
}
}
