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
        Queue qFilaSuper = new Queue();
        System.out.println(qFilaSuper.peek());
        qFilaSuper.push(new Nodo(500));
        qFilaSuper.push(new Nodo(100));
        qFilaSuper.push(new Nodo(200));
        System.out.println(qFilaSuper.peek());
        qFilaSuper.removerNodo();
        System.out.println(qFilaSuper.peek());
        qFilaSuper.removerNodo();
        System.out.println(qFilaSuper.peek());
        qFilaSuper.removerNodo();
        qFilaSuper.imprimir();
        

    }
}

class Nodo {

    private int iVal;
    private Nodo nPrev;
    private Nodo nSig;

    public Nodo() {
        iVal = 0;
        nPrev = null;
        nSig = null;
    }

    public Nodo(int iNum) {

        iVal = iNum;
        nPrev = null;
        nSig = null;
    }

    public Nodo(int iNum, Nodo nNodo) {
        iVal = iNum;
        nPrev = null;
        nSig = nNodo;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
}

class Queue {

    Nodo nIni;
    Nodo nFin;
    int cont=0;

    public Queue() {
        nIni = null;
        nFin = null;
    }

    public Queue(Nodo nNodo) {
        nIni = null;
        nFin = null;
    }

    public void push(Nodo nNodo) {//AGREGAR UN NODO AL FINAL DE LA LISTA 
        if (nIni == null) {//LISTA VACIA
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);//ENLAZADO EL NUEVO CON EL ULTIMO
            nNodo.setnPrev(nFin);
            nFin = nNodo;

        }
    }

    public int peek() {
      if(nIni!=null){
          return nIni.getiVal();
      }else{
          return-1;
      }
    }

    public int removerNodo() {
        int iVal = 0;
        if (nIni == null) {
            iVal = -1;
        } else {
            if (nIni.getnSig() == null) {
                nIni = null;
                nFin = null;
            } else {
                nIni = nIni.getnSig();
                nIni.setnPrev(null);
            }
        }
        return iVal;
    


    }
    public void imprimir(){
        Nodo Nnodo=nIni;
        while(Nnodo!=null){
            System.out.println(Nnodo.getiVal());
        }
        System.out.println();
    }

public int pop(){
   if(nIni!=null){
       int x=nIni.getiVal();
       nIni.getnSig().setnPrev(null);
       nIni=nIni.getnSig();
       cont--;
       return x;
   }else{
       return -1;
   }
}
public void isEmpty() {//Preguntar si esta vacia si no lo esta decirle que contine elementos
        if (nIni == null) {
            System.out.println("La lista esta vacia ");
        } else {
            System.out.println("La lista contiene elementos");
        }
    }

  public void vaciarLista() {//Hacerla vacia
        nIni = null;
        nFin = null;
    }
  public void Tamaño(){
      System.out.println("El tamaño de la cola " + cont);
  }

}
