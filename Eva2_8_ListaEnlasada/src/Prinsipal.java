
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Prinsipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Iprimir Lista
        Lista lsMiLista = new Lista();
       lsMiLista.imprimirlista();
       //Agregar Nodos
       lsMiLista.agregarNodo(new Nodo(100));
        System.out.println("");
        lsMiLista.imprimirlista();
        
        lsMiLista.agregarNodo(new Nodo(200));
        System.out.println("");
        lsMiLista.imprimirlista();
        
        lsMiLista.agregarNodo(new Nodo(300));
        System.out.println("");
        lsMiLista.imprimirlista();
        //Vaciar Lista
        lsMiLista.vaciarLista();
        System.out.println("");
        lsMiLista.imprimirlista();
        
        for (int i = 0; i < 10; i++) {
            lsMiLista.agregarNodo(new Nodo((int) (Math.random() * 1000) +1 ));
        }
        //Contar Nodos
        System.out.println("");
        System.out.println(  lsMiLista.contarNodos() );
        //Imprimir Lista
        lsMiLista.imprimirlista();
        System.out.println("");
        //Ver una pocicion
        try {
            System.out.println(lsMiLista.valorEn(3));
        } catch (Exception ex) {
            Logger.getLogger(Prinsipal.class.getName()).log(Level.SEVERE, null, ex);
        }
          //Agregar Inicio LIsta
        lsMiLista.insertarEn(0,new Nodo(9999));
        lsMiLista.imprimirlista();
        //Agregar AL Funal
        System.out.println("");
         lsMiLista.insertarEn(lsMiLista.contarNodos(),new Nodo(9999));
        lsMiLista.imprimirlista();
        //Cualquier posicion
        System.out.println("");
         lsMiLista.insertarEn(7,new Nodo(99999));
        lsMiLista.imprimirlista();
    }
    
}

//Clase Nodo
class Nodo {
    private int iVal;
    private Nodo nSig;
    
    public Nodo(){
        iVal =0;
        nSig = null;
    }
    public Nodo (int iNum){
        
        iVal=iNum;
        nSig = null;
    }
    public Nodo(int iNum,Nodo nNodo){
        iVal =iNum;
        nSig=nNodo;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
    
}

//Clase Lista
class Lista{
    private Nodo nIni;
    private Nodo nFin;
    public Lista(){
        nIni=null;
        nFin=null;
    }
    public Lista(Nodo nNodo){
        nIni = nNodo;
        nFin=nNodo;
    }
    
    /*public void agregarNodo(Nodo nNodo){//Siempre al final
        if(nIni == null){
            nIni =nNodo;//Nodo inicial
        }else{
            Nodo nTemp =nIni;
            while(nTemp.getnSig() != null){
                nTemp =nTemp.getnSig();
            }
            nTemp.setnSig(nNodo);
        }
        
    }*/
    public void agregarNodo(Nodo nNodo){
        if(nIni == null){
             nIni=nNodo;
            nFin=nNodo;
        }else{
            nFin.setnSig(nNodo);
            nFin = nNodo;
            //nFin = nFin.getnSig(); Tambien es valido
        }
    }
    
    public void imprimirlista(){
         if(nIni == null){
             System.out.print("Lista Vacia");
        }else{
            Nodo nTemp =nIni;
            while(nTemp != null){
                System.out.print(nTemp.getiVal() + " - ");
                nTemp =nTemp.getnSig();
            }
            
        }
    }
    
     public void vaciarLista(){
         nIni = null;
     }
     public int contarNodos(){
     int iCont;
     
         if(nIni == null){
             iCont=0;
        }else{
             iCont=0;
         }
            Nodo nTemp =nIni;
            while(nTemp != null){
                iCont++;
                nTemp =nTemp.getnSig();
            }
            return iCont;
     }
     
     public int valorEn(int iPos) throws Exception{//Pocicion 0 Primer nodo hasta n-1 
        /*int iCont = 0;
         int iVal=0;
         if(nIni == null){
             iVal = nIni.getiVal();
        }else{
             
            Nodo nTemp =nIni;
            while(nTemp != null){
                if(iCont == iPos){
                    iVal = nTemp.getiVal();
                    break;
                }else{
                nTemp =nTemp.getnSig();
                iCont++;
                }
            }
     
         }
         return iVal;*/
     if(iPos<0 || (iPos >= contarNodos()))
         throw new Exception("Esa Pocision no existe");
         int iCont =0;
         int iVal =0;
         Nodo nTemp = nIni;
         while(iCont < iPos){
             nTemp = nTemp.getnSig();
             iCont++;
         }
         iVal = nTemp.getiVal();
         return iVal;
     
     }
     
     public void insertarEn(int iPos,Nodo nNodo){
         if(iPos == 0){
             nNodo.setnSig(nIni);//Conectamos al nuevo nodo de la lista
             nIni = nNodo;//Se conecta al nuevo nodo
         }else if(iPos == contarNodos()){//Final de la ista
             agregarNodo(nNodo);
         }else{
             int iCont = 0;
      
         Nodo nTemp = nIni;
         while(iCont < (iPos-1) ){
             nTemp = nTemp.getnSig();
             iCont++;
         }
         nNodo.setnSig(nTemp.getnSig());
         nTemp.setnSig(nNodo);
         }
         
     }
     public void DeleteEn(int iPos, Nodo nNodo){
      
         
     }
        
}