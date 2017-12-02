import java.util.logging.Level;
import java.util.logging.Logger;
public class Principal 
{
    public static void main(String[] args) 
    {
        try 
        {
            Arbol MiArbol = new Arbol();
            MiArbol.agegarNuevoNodo(new nodo(550));
            MiArbol.agegarNuevoNodo(new nodo(400));
            MiArbol.agegarNuevoNodo(new nodo(300));
            MiArbol.agegarNuevoNodo(new nodo(250));
            MiArbol.agegarNuevoNodo(new nodo(450));
            MiArbol.agegarNuevoNodo(new nodo(200));
            MiArbol.agegarNuevoNodo(new nodo(100));
            MiArbol.imprimirPreOrden();
            System.out.println("");
            MiArbol.imprimirInOrder();
            System.out.println("");
            MiArbol.imprimirPostOr();
        } catch (Exception ex) 
        {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
class nodo
{
    private int iVal;
    private nodo nIzq;
    private nodo nDer;
    public nodo() 
    {
        iVal=0;
        nIzq=null;
        nDer=null;
    }
    public nodo(int iVal) 
    {
        this.iVal = iVal;
        nIzq=null;
        nDer=null;
    }
    public int getiVal() 
    {
        return iVal;
    }
    public void setiVal(int iVal) 
    {
        this.iVal = iVal;
    }
    public nodo getnIzq() 
    {
        return nIzq;
    }
    public void setnIzq(nodo nIzq) 
    {
        this.nIzq = nIzq;
    }
    public nodo getnDer() 
    {
        return nDer;
    }
    public void setnDer(nodo nDer) 
    {
        this.nDer = nDer;
    }
}
class Arbol
{
    private nodo nRoot;
    public Arbol()
    {
        nRoot=null;
    }
    public Arbol(nodo nNodo)
    {
        nRoot=nNodo;
    }
    public void agegarNuevoNodo(nodo nNodo)throws Exception
    {
        agregarNodo(nRoot, nNodo);
    }
    public void agregarNodo(nodo nActual, nodo nNodo)throws Exception
    {
        if(nRoot==null)
        {
            nRoot=nNodo;
        }
        else
        {
            if(nNodo.getiVal()<nActual.getiVal())
            {
                if(nActual.getnIzq()==null)
                {
                    nActual.setnIzq(nNodo);
                }
                else
                {
                    agregarNodo(nActual.getnIzq(),nNodo);
                }
            }
            else if(nNodo.getiVal()>nActual.getiVal())
            {
                if(nActual.getnDer()==null)
                {
                    nActual.setnDer(nNodo);
                }
                else
                {
                    agregarNodo(nActual.getnDer(),nNodo);
                }
            }
            else
            {
                throw new Exception("NO SE ACEPTAN NUMEROS REPETIDOS");
            } 
        }
    }
    public void imprimirPreOrden()
    {
        impPO(nRoot);
    }
    public void impPO(nodo nActual)
    {
        if(nActual != null){
            System.out.print(nActual.getiVal()+" - ");
            impPO(nActual.getnIzq());
            impPO(nActual.getnDer());
        }
    }
    public void imprimirInOrder()
    {
        impIO(nRoot);
    }
     public void impIO(nodo nActual){ //recorrido en inorden 
    
        if(nActual!=null)
        {
            impIO(nActual.getnIzq());
            System.out.print(nActual.getiVal()+" - ");
            impIO(nActual.getnDer());
        }           
    }
   public void imprimirPostOr(){
       impPosOR(nRoot);
   }public void impPosOR(nodo nPresente){
       if(nPresente!=null){
           impPosOR(nPresente.getnIzq());
           impPosOR(nPresente.getnDer());
           System.out.print(nPresente.getiVal()+ " - ");
       }
   }
}
