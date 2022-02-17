/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Angel
 */
import java.io.File;
import java.io.IOException;

/**
 *
 * @author caste
 */
public class Menu {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        File Doc;
        Doc = new File("datos.txt");
        Datos datos = new Datos();

        System.out.println("-- Calculadora PosFix --");
        
        //verificamos si el archivo se proporciono o no
        if (!Doc.exists()) {
            
            System.out.println("No ha proporcionado ningun archivo, por favor proporcione uno");
            
        } else {
            //En caso de estar el archivo se llama a la funcion para leer el archivo

            datos.leer(Doc);
      
        }
        
    }
}
