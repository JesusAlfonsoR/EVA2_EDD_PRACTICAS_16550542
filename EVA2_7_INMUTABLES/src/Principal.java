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
        //PROBLEMA, ES MUY TARDADO Y OCUPA MUCHO ESPACIO
        int[] aiDatos = new int[3];
        aiDatos[0] = 1;
        aiDatos[1] = 15;
        aiDatos[2] = 23;
        int[] aiBackup = new int[3];
        int i = 0;
        for (int aiDato : aiDatos) 
        { // LOS ARREGLOS NO SE PUEDEN CAMBIAR, SOLO SE PUEDE CREAR UNO NUEVO  //for(int i=0;i<aiDato.lenght; i++)
            System.out.println(aiDato);
            aiBackup[i] = aiDato;//"i" MARCA POSICIONES Y SE AUMENTA , TAMBIEN OUEDE HACERSE CON UN FOR NORMAL
            i++;
        }

        aiDatos = new int[4];
        for (int j = 0; j < aiBackup.length; j++) 
        {
            aiDatos[j] = aiBackup[j];
        }
        for (int aiDato : aiDatos) 
        {
            System.out.println(aiDato);
        }
    }

}
