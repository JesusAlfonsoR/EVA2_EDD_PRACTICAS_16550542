
import java.util.LinkedList;

/**
 *
 * @author 16550542
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        LinkedList <String> llMiLista = new LinkedList();
        llMiLista.add("HOLA");
        llMiLista.add(" ");
        llMiLista.add("MUNDO");
        llMiLista.add(" ");
        llMiLista.add("CRUEL!!!!");
        llMiLista.add(" ");
        llMiLista.add("COLLECTIONS");
        for (String string : llMiLista) {
            System.out.print(string);
        }
        llMiLista.remove(4);
        System.out.println();
        System.out.println(llMiLista);
        llMiLista.add(4, "BONDOSO");
        System.out.println(llMiLista);
    }
    
}
