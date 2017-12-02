/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author poncho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int n=5,i=3;
        System.out.println(potencia(n,i));
    }
    
    public static int potencia(int x, int y)
    {
        if(y==1)
        {
            return x;
        }
        else
        {
            y--;
            return  x*potencia(x,y);
        }
    }
}


