
import java.util.Stack;

/**
 *
 * @author 16550542
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        Stack <Double> stMiPila = new Stack();
        stMiPila.push(10.0);
        stMiPila.push(20.0);
        stMiPila.push(30.0);
        stMiPila.push(40.0);
        stMiPila.push(50.0);
        System.out.println(stMiPila.pop());
        System.out.println(stMiPila.pop());
        System.out.println(stMiPila.peek());
        System.out.println(stMiPila.pop());
        System.out.println(stMiPila.peek());
    }
    
}
