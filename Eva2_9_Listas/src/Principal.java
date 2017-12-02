
import java.util.logging.Level;
import java.util.logging.Logger;

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
            //OBJETO DE TIPO LISTA

            Lista miLista = new Lista();
            miLista.imprimirNodos();
            miLista.agregarNodo(new Nodo(15));
            miLista.imprimirNodos();
            System.out.println("");
            miLista.agregarNodo(new Nodo(35));
            miLista.imprimirNodos();
            System.out.println("");
            miLista.agregarNodo(new Nodo(45));
            miLista.imprimirNodos();
            System.out.println("");
            miLista.agregarNodo(new Nodo(60));
            miLista.imprimirNodos();
            System.out.println("");
            miLista.remove(2);
            System.out.println("");
            miLista.imprimirNodos();
            System.out.println("");
            miLista.Buscar(45);
            System.out.println("");
            miLista.contarElementos();
            System.out.println("");
            miLista.valorEn(2);
            System.out.println("");
            miLista.insertar(0,new Nodo (87));
            miLista.imprimirNodos();
            System.out.println("");
            miLista.contarElementos();
            miLista.vaciarLista();
            System.out.println("");
            miLista.isEmpty();
           
             
           
         
            /*
            for (int i = 0; i < 100000; i++) {
                int iVal = (int) (Math.random() * 1000) + 1;
                miLista.agregarNodoMejorado(new Nodo(iVal));
            }
            System.out.println("" + miLista.contarElementos());
            System.out.println("El elemento en la posicion 5 es = " + miLista.valorEn(5)); // SE USA TRY-CATCH POR QUE "valorEn" PUEDE GENERAR UNA EXCEPTION
        } catch (Exception ex) {
           Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
       */  }

    }


class Nodo {

    private int iValor;
    private Nodo nSig;

    //INICIAR ATRIBUTOS
    public Nodo() {
        iValor = 0;
        nSig = null;
    }
    //CONSTRUCTOR DEFAULT

    public Nodo(int iVal) {
        iValor = iVal;
        nSig = null;

    }

    public Nodo(int iVal, Nodo nNod) {//CONTRUSCTOR PARA AMBOS ATRIBUTOS
        iValor = iVal;
        nSig = nNod;
    }
    //Getter and Setter

    public int getiValor() {
        return iValor;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

}

class Lista {//DEBE TENER UN NODO INICIAL,IMPRIMIR

    private Nodo nIni;
    private Nodo nFin;
    int cont = 0;

    public Lista() {
        nIni = null;//AQUI SE SABE CUANDO LLEGAMOS AL FINAL 
        nFin = null;//ESTE APUNTARA AL FINAL

    }

    public Lista(Nodo nNodo) {
        nIni = nNodo;
        nFin = null;
    }

    //AGREGAR NODOS LOS COLOCA AL FINAL DE LA LISTA
    public void agregarNodo(Nodo nNodo) {//NO USAR JAMAS!!!!!
        //MOVERSE AL FINAL DE LA LISTA
        Nodo nTemp = nIni;
        if (nIni == null) {
            nIni = nNodo;//CUANDO LA LISTA ESTA VACIA
            cont++;
        } else {
            while (nTemp.getnSig() != null) {
                nTemp = nTemp.getnSig();
                cont++;
            }
            nTemp.setnSig(nNodo);
        }

    }

    public void agregarNodoMejorado(Nodo nNodo) //PARA EVITAR QUE SE RECORRA TODO
    {
        if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;
            cont++;
        } else {
            nFin.setnSig(nNodo);
            nFin = nNodo;
            cont++;
        }
    }

    //IMPRIMIR NODOS
    public void imprimirNodos() {

        //MOVERSE AL FINAL DE LA LISTA
        Nodo nTemp = nIni;
        if (nTemp == null) {
            System.out.print("LA LISTA ESTA VACIA");
        } else {
            while (nTemp != null) {
                System.out.print(nTemp.getiValor() + " - ");
                nTemp = nTemp.getnSig();

            }
        }
    }

    public void Buscar(int x) {
        Nodo nNodo = nIni;
        int y = 1;
        while (nNodo != nFin) {//Mientras sea diferente se hacen todas las busquedas
            if (x == nNodo.getiValor()) {//Cuando el numero es igual al nodo en el que estamos lo imprimimos
                System.out.println("El valor: " + x + " esta en la posición: " + y);
                nNodo = null;//Igualamaos a nulo para que no entre a los demas
            }
            if (null != nNodo) {//Pennultimo nodo
                if (nNodo.getnSig() == nFin) {//Si el nodo sig es el final
                    nNodo = nNodo.getnSig();//Posicionarse en el nodo final
                    if (x == nNodo.getiValor()) {//Imprimir nodo final
                        y++;
                        System.out.println("El valor: " + x + " esta en la posición: " + y);
                        nNodo = null;
                    }
                    if (nNodo != null) {//Si llega a este punto no existe
                        System.out.println("El valor no existe");
                    }
                }
            }
            if (nNodo != null) {//nODO POR NODO
                nNodo = nNodo.getnSig();
                y++;

            }
            if (nNodo == null) {
                nNodo = nFin;
            }
        }
    }

    public void remove(int x)
    {
        Nodo nNodo = nIni;
        if(x==1)
        {
            nIni=nNodo.getnSig();
            cont--;
        }
        else
        {
            for (int i = 0; i < (x-2); i++) 
            {
                nNodo = nNodo.getnSig();
            }
            nNodo.setnSig(nNodo.getnSig().getnSig());
            cont--;
        }
    }

    //VACIAR LISTA -----> AL MENOS PARA JAVA SIMPLEMENTE nIni SE ASIGNA A NULO Y SE ELIMINA LA LISTA
    public void vaciarLista() {
        nIni = null;
        nFin = null;
    }

    //CONTAR LOS ELEMENTOS DE LA LISTA
    public void contarElementos()
    {
        System.out.println("El tamaño de la lista es de: " + cont);
    }
    public void valorEn(int n)
    {
        Nodo nNodo = nIni;
        for (int i = 0; i < (n-1); i++) {
            nNodo = nNodo.getnSig();
        }
        System.out.println("El Valor en la posicion " + n + " es de: " + nNodo.getiValor());
    }

    public void isEmpty() {//Preguntar si esta vacia si no lo esta decirle que contine elementos
        if (nIni == null) {
            System.out.println("La lista esta vacia ");
        } else {
            System.out.println("La lista contiene elementos");
        }
    }

   
    public void insertar(int j, Nodo nIns)
    {
        Nodo nNodo = nIni;
        if(j==1)
        {
            nIni=nNodo.getnSig();
            nIns.setnSig(nNodo);
            nIni=nIns;
            cont++;
        }
        else
        {
            for (int i = 0; i < (j-2); i++) 
            {
                nNodo = nNodo.getnSig();
            }
            nIns.setnSig(nNodo.getnSig());
            nNodo.setnSig(nIns);
            cont++;
        } 
    }
}
