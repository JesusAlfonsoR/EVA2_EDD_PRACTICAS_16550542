import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author 16550542
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        ArrayList <Integer> alMiArrayList = new ArrayList();
        alMiArrayList.add(100);//0
        alMiArrayList.add(200);//1
        alMiArrayList.add(300);//2
        alMiArrayList.add(400);//3
        alMiArrayList.add(500);//4
        for (Integer integer : alMiArrayList) {
            System.out.print(integer + " - ");
        }
        alMiArrayList.add(2, 999);
        System.out.println("");
        for (Integer integer : alMiArrayList) {
            System.out.print(integer + " - ");
        }
        System.out.println("");
        Iterator itRecorreArray = alMiArrayList.iterator();
        while(itRecorreArray.hasNext())
        {
            System.out.print(itRecorreArray.next() + " - ");
        }
    }
    
}
