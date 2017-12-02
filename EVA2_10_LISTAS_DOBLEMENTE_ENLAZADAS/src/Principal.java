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
        listaDE ideMilista = new listaDE();
        ideMilista.imprimirElementos();//Decimos que nuestras listas estan vacias 
        ideMilista.imprimirElementosInv();
        for (int i = 0; i < 10; i++) {//Se llena la lista
            ideMilista.agregarNodo(new Nodo((int) (Math.random() * 100) + 1));
        }
        System.out.println("");
        ideMilista.imprimirElementos();
        System.out.println("");
        ideMilista.insertar(10, new Nodo(155));
        System.out.println("");
        ideMilista.imprimirElementos();
        /*   ideMilista.imprimirElementosInv(); //Imprimen elementos en orden inverso
        System.out.println("");*/
        // System.out.println("");
        //ideMilista.Tamaño();
        //System.out.println("");
        //ideMilista.Buscar(45);
        //ideMilista.VaciarLista(); //Vaciar lista
        //System.out.println("");
        //ideMilista.imprimirElementos();
        ideMilista.remove(10);//REMOVEMOS EL VALOR 3
        ideMilista.imprimirElementos();
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

class listaDE {

    Nodo nIni;
    Nodo nFin;
    int cont = 0;

    public listaDE() {
        nIni = null;
        nFin = null;
    }

    public listaDE(Nodo nNodo) {
        nIni = null;
        nFin = null;
    }

    public void agregarNodo(Nodo nNodo) {//AGREGAR UN NODO AL FINAL DE LA LISTA
        if (nIni == null) {//LISTA VACIA
            nIni = nNodo;
            nFin = nNodo;
            cont++;
        } else {
            nFin.setnSig(nNodo);//ENLAZADO EL NUEVO CON EL ULTIMO
            nNodo.setnPrev(nFin);
            nFin = nNodo;
            cont++;
        }
    }

    public void imprimirElementos() {
        Nodo nTemp = nIni;
        if (nIni == null) {
            System.out.println("La lista esta vacia");
        }
        while (nTemp != null) {
            System.out.print(nTemp.getiVal() + " _ ");
            nTemp = nTemp.getnSig();
        }
    }

    public void imprimirElementosInv() {
        Nodo nTemp = nIni;
        if (nTemp == null) {
            System.out.println("La lista esta vacia");
        } else {

            while (nTemp != null) {
                System.out.print(nTemp.getiVal());
                nTemp = nTemp.getnPrev();
            }

        }
    }

    public void isEmpty() {//Preguntar si esta vacia si no lo esta decirle que contine elementos
        if (nIni == null) {
            System.out.println("La lista esta vacia ");
        } else {
            System.out.println("La lista contiene elementos");
        }
    }

    public void remove(int x) {
        Nodo nNodo = nIni;
        Nodo nOtro;
        if (x > cont || x < 1) {//Valor inexistente
            System.out.println("El valor a remover no existe");
        }
        if (x == 1) {
            nIni = nNodo.getnSig();
            cont--;
        }
        if (x == cont) {//Ultimo
            nNodo=nFin.getnPrev();
            nNodo.setnSig(null);
            nFin=nNodo;
            cont--;
        }
        if (cont >= x)//Numero en medio del arreglo
        {
            for (int i = 0; i < (x - 1); i++) {
                nNodo = nNodo.getnSig();
            }
            //Conexiones y desconexiones
            nOtro = nNodo;
            nOtro = nOtro.getnPrev();
            nNodo = nNodo.getnSig();
            nOtro.setnSig(nNodo);
            nNodo.setnPrev(nOtro);

        }

    }

    public void VaciarLista() {
        nIni = null;
        cont=0;
    }

    public void Tamaño() {

        System.out.println("El tamaño de la lista es :" + cont);
    }

    public void Buscar(int x) {
        Nodo nNodo = nIni;
        int y = 1;
        while (nNodo != nFin) {//Mientras sea diferente se hacen todas las busquedas
            if (x == nNodo.getiVal()) {//Cuando el numero es igual al nodo en el que estamos lo imprimimos
                System.out.println("El valor: " + x + " esta en la posición: " + y);
                nNodo = null;//Igualamaos a nulo para que no entre a los demas
            }
            if (null != nNodo) {//Pennultimo nodo
                if (nNodo.getnSig() == nFin) {//Si el nodo sig es el final
                    nNodo = nNodo.getnSig();//Posicionarse en el nodo final
                    if (x == nNodo.getiVal()) {//Imprimir nodo final
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

    public void insertar(int x, Nodo nIns) {
        int cont2 = 1, o = 0;//Se usa para saber si ya la insertamos o aun no
        Nodo nNodo = nIni;
        Nodo nremovido = null;
        if (x == 1) {//Cambios respectivos
            nIns.setnSig(nIni.getnSig());
            nIns.setnPrev(null);
            nIni = nIns;
            cont++;
            o++;//Le decimos que es un cambio
        }
        if (x == cont) {//ultima posicion
            nIns.setnPrev(nFin);
            nIns.setnSig(null);
            nFin.setnSig(nIns);
            nFin = nIns;
            cont++;
            o++;//CAMBIO
        }
        if (x > cont || x < 1) { //EN CASO DE QUE NOS DEN UNO MAYOR 
            System.out.println("Ingresa un valor valido");
            o++;
        }
        while (cont2 < x && x != 1 && x != cont && x < cont && x > 0) {//CUANDO NO SE CUMPLE NINGUNA CONDICON DE LAS ANTERIORES
            nNodo = nNodo.getnSig();//MOVERSE ENTRE NODOS
            cont2++;
        }
        if (o == 0) {//CUANDO LLEGUES AL NODO QUE TE PIDEN SE HACEN LOS CAMBIOS 
            nremovido = nNodo;
            nNodo = nNodo.getnPrev();
            nIns.setnSig(nremovido);
            nIns.setnPrev(nNodo);
            nNodo.setnSig(nIns);
            nremovido.setnPrev(nIns);
            cont++;
        }
    }
    public void finfKth(int x){
        Nodo nNodo =nIni;
        for (int i = 0; i < (x-1); i++) {
            nNodo=nNodo.getnSig();           
        }
        System.out.println("El valor en la posicio " + x + "es de  " + nNodo.getiVal());
    }
}
