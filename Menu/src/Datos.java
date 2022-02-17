/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Angel
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author caste
 */
public class Datos {
    

    FileReader leer;
    BufferedReader buffer;
    Vector <Integer> op = new Vector<Integer>();

    /**
     *
     * @param datos
     * @throws IOException
     */
    public void leer(File datos) throws IOException{
        //Con este metodo se lee el archivo donde se encuentran las expresiones matematicas
        String letra = "";
        String linea;

        int cont = 0;

        datos = new File("datos.txt");
        leer = new FileReader(datos);
        buffer = new BufferedReader(leer);

        while (letra != null) {

            cont = cont + 1;
            letra = buffer.readLine();
            linea = letra;
            int total = op.Evaluate(linea);
            //aqui se van imprimiendo los resultados de las operaciones
            System.out.println("El total de la operacion " + cont + " es: " + total);
            
        }
    }
    
}
