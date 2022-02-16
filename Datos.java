import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Datos {
    

    FileReader leer;
    BufferedReader buffer;
    Vector <Integer> op = new Vector<Integer>();

    public void leer(File datos) throws IOException{

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
            System.out.println("El total de la operacion " + cont + " es: " + total);
            
        }
    }
    
}