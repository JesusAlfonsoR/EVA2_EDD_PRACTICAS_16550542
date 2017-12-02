
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LinkedList <Persona> liPersona = new LinkedList();
      liPersona.add(new Persona("Alonso" , "Hernandez " , 35 , true, 1 ));
       liPersona.add(new Persona("Daniel" , "Romero " , 43 , true, 32555 ));
        liPersona.add(new Persona("Javier" , "Salas " , 23 , true, 100000 ));
        for (Persona liPersona1 : liPersona) {
            System.out.println("Nombre " + liPersona1.getsNom() + "\n" +
            "Apellidos" + liPersona1.getsApe() + "\n" + "Edad" +
            liPersona1.getIed() + "\n"+ "Sexo " +liPersona1.isIsex() + "\n"+
            "Salario" + liPersona1.getsSal());
            
        }
        Comparator Comparator1= new Comparator(){

          @Override
          public int compare(Object o1, Object o2) {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               Persona p1= (Persona)o1;
               Persona p2= (Persona)o2;
             
                String sApe1,sApe2;
               sApe1=p1.getsApe();
               sApe2=p2.getsApe();
               char c1,c2;
               c1=sApe1.charAt(0);
               c2=sApe2.charAt(0);
               return c2=c1;
          }
            
        };
        System.out.println("");
        System.out.println("LISTA ORDENADA APELLIDOS");
        
    }
}

class Persona{
    private String sNom;
      private String sApe;
      private int ied;
      private boolean isex;
      private double sSal;
      public Persona(){
}
      public Persona (String sNom,String sApe,int ied,boolean isex,double sSal){
          this.sNom=sNom;
          this.sApe=sApe;
          this.ied=ied;
          this.isex=isex;
          this.sSal=sSal;
          
      }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsApe() {
        return sApe;
    }

    public void setsApe(String sApe) {
        this.sApe = sApe;
    }

    public int getIed() {
        return ied;
    }

    public void setIed(int ied) {
        this.ied = ied;
    }

    public boolean isIsex() {
        return isex;
    }

    public void setIsex(boolean isex) {
        this.isex = isex;
    }

    public double getsSal() {
        return sSal;
    }

    public void setsSal(double sSal) {
        this.sSal = sSal;
    }

    
}