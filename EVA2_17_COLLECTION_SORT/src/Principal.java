
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author invitado
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
        System.out.println("");
        Collections.sort(llMiLista);
        for (String string : llMiLista) {
            System.out.print(string);
        }
    }
    
}
