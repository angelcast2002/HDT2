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

public class Menu {
    public static void main(String[] args) throws IOException {

        File Doc;
        Doc = new File("datos.txt");
        Datos datos = new Datos();

        System.out.println("-- Calculadora PosFix --");
        

        if (!Doc.exists()) {
            
            System.out.println("No ha proporcionado ningun archivo, por favor proporcione uno");
            
        } else {

            datos.leer(Doc);
      
        }
        
    }
}
