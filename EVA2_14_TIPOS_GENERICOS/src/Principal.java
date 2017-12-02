/**
 *
 * @author 16550542
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        Nodo <Double> nMiNodo = new Nodo("Hola Mundo!");
        /*usar get y set con un doble*/
//nMiNodo  las funciones get y set se definen desde los 
//<> donde todo se va a devolver de acuerdo al tipo de dato geneerico
    }
}
class Nodo <T> 
{
    private T Valor;
    private Nodo nSig;
    private Nodo nPrev;
    public Nodo()
    {
        
    }
    public Nodo(T nuevoValor)
    {
        Valor = nuevoValor;
        Nodo nSig = null;
        Nodo nPrev = null;
    }
    public T getValor() {
        return Valor;
    }

    public void setValor(T Valor) {
        this.Valor = Valor;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }
    
}
